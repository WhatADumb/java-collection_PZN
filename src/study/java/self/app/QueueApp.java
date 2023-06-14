package study.java.self.app;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
        // Queue<String> data = new PriorityQueue<>();
        Queue<String> data = new LinkedList<>();
        // Queue<String> data = new ArrayDeque<>();

        data.add("Entry");
        data.add("Magnus");
        data.add("Elder");

        for(String next = data.poll(); next != null; next = data.poll()){
            System.out.println(next);
        }

        System.out.println("Size of Queue: " + data.size());
    }
}
