package study.java.self.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchApp {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>(1_000);

        for(int i = 1; i <= 1_000; i++){
            data.add(i);
        }

        int indexData = Collections.binarySearch(data, 500);
        System.out.println("Index of 500: " + indexData);

        Comparator<Integer> reverse = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        int indexData2 = Collections.binarySearch(data, 500, reverse);
        System.out.println("Reverse Index of 500: " + indexData2);
    }
}
