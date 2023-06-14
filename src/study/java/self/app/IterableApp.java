package study.java.self.app;

import java.util.Iterator;
import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        System.out.println("ITERABLE");
        Iterable<String> names = List.of("Hendrix", "Salvadore", "Antonio");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("\nITERATOR");
        Iterator<String> iters = names.iterator();
        while(iters.hasNext()){
            String iter = iters.next();
            System.out.println(iter);
        }
    }
}
