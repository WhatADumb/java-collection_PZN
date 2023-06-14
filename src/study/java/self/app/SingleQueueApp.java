package study.java.self.app;

import java.util.Queue;

import study.java.self.collection.SingleQueue;

public class SingleQueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new SingleQueue<>();

        System.out.println(queue.offer("data-1"));
        System.out.println(queue.offer("data-2"));
        System.out.println(queue.offer("data-3"));

        System.out.println(queue.size());

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.size());
    }
}
