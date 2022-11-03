package multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        new Person("Vova", callBox);
        new Person("Artem", callBox);
        new Person("Anna", callBox);
        new Person("Artur", callBox);
    }
}

class Person extends Thread {
    private String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }
    public void run() {

        try {
            System.out.println(name + " is waiting...");
            callBox.acquire();
            System.out.println(name + " is using telephone.");
            sleep(2000);
            System.out.println(name + " finished call.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
