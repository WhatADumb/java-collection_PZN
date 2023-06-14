package study.java.self.app;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();

        stack.addFirst("This");
        stack.addFirst("is");
        stack.addFirst("Text");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque<String> repStack = new LinkedList<>();

        repStack.addLast("This");
        repStack.addLast("is");
        repStack.addLast("Text");

        System.out.println(repStack.pollFirst());
        System.out.println(repStack.pollFirst());
        System.out.println(repStack.pollFirst());
    }
}
