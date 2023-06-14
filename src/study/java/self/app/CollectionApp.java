package study.java.self.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> dataCollection = new ArrayList<>();

        System.out.println("Add Data");

        dataCollection.add("Java");
        dataCollection.add("PHP");
        dataCollection.addAll(List.of("Ruby", "Rust", "JS", "TS"));

        for(String val : dataCollection){
            System.out.println(val);
        }

        System.out.println("\nDelete Data");

        dataCollection.remove("PHP");
        dataCollection.removeAll(List.of("Rust", "TS"));

        for(String val : dataCollection){
            System.out.println(val);
        }

        System.out.println("\nFind Data");

        System.out.println(dataCollection.contains("Java"));
        System.out.println(dataCollection.containsAll(List.of("Ruby", "JS")));

        System.out.println("Size of this Collection: " + dataCollection.size());
    }
}
