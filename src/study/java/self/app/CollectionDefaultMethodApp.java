package study.java.self.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class CollectionDefaultMethodApp {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();

        for(int i = 1; i <= 100; i++){
            data.add(i);
        }

        data.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer t) {
                return t * 10;
            }
        });

        data.forEach(new Consumer<Integer>() {
            public void accept(Integer t) {
                System.out.println("Data: " + t);
            };
        });

        data.removeIf(new Predicate<Integer>() {
            public boolean test(Integer t) {
                return t > 500;
            };
        });
        
        System.out.println(data);
    }
}
