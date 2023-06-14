package study.java.self.app;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorApp {
    public static void main(String[] args) {
        List<String> code = List.of("Alpha", "Beta", "Celeron");

        Spliterator<String> spltCode = code.spliterator();
        Spliterator<String> spltCode2 = spltCode.trySplit();

        System.out.println(spltCode.estimateSize());
        System.out.println(spltCode2.estimateSize());

        spltCode.forEachRemaining(new Consumer<String>() {
            public void accept(String t) {
                System.out.println(t);
            };
        });

        System.out.println("======================");

        spltCode2.forEachRemaining(new Consumer<String>() {
            public void accept(String t) {
                System.out.println(t);
            };
        });
    }
}
