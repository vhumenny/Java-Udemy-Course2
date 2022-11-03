package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Atm {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();

        new Employee("Zaur", lock);
        new Employee("Vova", lock);
        new Employee("Oleg", lock);
        Thread.sleep(5000);
        new Employee("Anna", lock);
        new Employee("Artem", lock);

    }
}

class Employee extends Thread {
    private String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run() {
        if (lock.tryLock()) {
            try {
//            System.out.println(name + " waiting...");
//            lock.lock();
                System.out.println(name + " using ATM");
                Thread.sleep(2000);
                System.out.println(name + " finished using ATM");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name+" doesn't want to wait.");
        }
    }
}