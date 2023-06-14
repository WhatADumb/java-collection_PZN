package study.java.self.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApp {
    public static void main(String[] args) {
        List<String> code = new ArrayList<>();

        code.addAll(List.of("Alpha", "Delta", "Enigma", "Celeron", "Beta"));

        Collections.sort(code);

        for(String data : code){
            System.out.println(data);
        }

        Comparator<String> reverse = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        Collections.sort(code, reverse);

        for(String data : code){
            System.out.println(data);
        }
    }
}
