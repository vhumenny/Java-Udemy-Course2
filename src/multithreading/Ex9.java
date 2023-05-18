package multithreading;

import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Ex9 {
    //    public static void main(String[] args) throws InterruptedException {
//
////        System.out.println("Method main begins");
////        Thread thread = new Thread(new Worker());
////
////        System.out.println(thread.getState());
////        thread.start();
////        System.out.println(thread.getState());
////        thread.join();
////        System.out.println(thread.getState());
////
////        System.out.println("Method main ends");
//
//        method();
//    }
    int a = 10;

    public static void main(String[] args) {
        int a[]  = {1, 2, 053, 4};
        int b[][] = {{1, 2, 4}, {2, 2, 1}, {0, 43, 2}};
        System.out.print(a[3] == b[0][2]);
        System.out.print("" + (a[2] == b[2][1]));

    }

    class Worker implements Runnable {

        @Override
        public void run() {
            System.out.println("work begins");
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("work ends");
        }
    }
}