package study.java.self.app;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("data-1");
        stack.push("data-2");
        stack.push("data-3");
        stack.push("data-4");

        for(String val = stack.pop(); val != null; val = stack.pop()){
            System.out.println(val);
        }
    }
}
