package study.java.self.app;

import java.util.ArrayList;
// import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        // List<String> names = new LinkedList<>();

        names.add("Fadhil");
        names.add("Firmansyah");
        
        names.set(1, "Priyatama");

        names.remove(0);
        
        System.out.println(names.get(0));

        for(var data : names){
            System.out.println(data);
        }
    }
}
