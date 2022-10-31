public class Main {
    public volatile static Boolean isWork = true;
    public volatile static Boolean isFixedProduction = false;

    public static void main(String[] args) throws InterruptedException {
        Thread supermarketFlow = new Thread(new SupermarketFlow());
        Thread workflow = new Thread(new WorkFlow());

        workflow.start();
        supermarketFlow.start();

        workflow.join();
        supermarketFlow.join();

        System.out.println("Hello world!");
    }

    static class SupermarketFlow implements Runnable {
        @Override
        public void run() {
            System.out.println("Buy milk");
            synchronized (isWork) {
                try {
                    if (!isFixedProduction) {
                        isWork.wait();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Fire of work");
                isWork = false;
            }
            System.out.println("Buy butter");

        }
    }

    static class WorkFlow implements Runnable {
        @Override
        public void run() {
            System.out.println("Call boss");
            synchronized (isWork) {
                if (isWork) {
                    System.out.println("Fix production");
                } else {
                    System.out.println("Fix production failed");
                }
                isWork.notify();
                isFixedProduction = true;
            }
        }
    }
}