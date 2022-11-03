package multithreading;

public class InterruptionExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();

        thread.join();
        System.out.println("main ends");
    }
}

class InterruptedThread extends Thread {
    double sqrtSum = 0;

    public void run() {
        for (int i = 1; i <= 1000000000; i++) {
            if (isInterrupted()) {
                System.out.println("Trying to interrupt the thread");
                System.out.println("We see that status of all threads is ok, so we decided to finish thread work");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Someone is trying to finish thread while it's sleeping. Let's finish it.");
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}