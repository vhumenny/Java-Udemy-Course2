package collections.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Vladimir");
        queue.offer("Anna");
        queue.offer("Artem");
        queue.offer("Vasiliy");
        queue.offer("Sergey");

        System.out.println(queue);
        queue.remove();
        System.out.println(queue.element());
        queue.remove();
        System.out.println(queue.element());
        queue.remove();
        System.out.println(queue.element());
        queue.remove();
        System.out.println(queue.element());
        queue.poll();
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
    }
}
