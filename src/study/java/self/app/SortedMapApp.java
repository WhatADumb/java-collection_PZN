package study.java.self.app;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {
        Comparator<String> strComparator = new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        SortedMap<String, String> map = new TreeMap<>(strComparator);

        map.put("Name-2", "342");
        map.put("Name-1", "234");
        map.put("Name-3", "9230");

        for(var data : map.keySet()){
            System.out.println(data);
        }

        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> dataMap = Collections.unmodifiableSortedMap(map);

        dataMap.put("data-baru", "sample"); //Error
    }
}
