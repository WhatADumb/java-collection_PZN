package study.java.self.app;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("data-1", "alpha");
        map.put("data-2", "beta");
        map.put("data-3", "celeron");

        for(var key : map.keySet()){
            System.out.println(map.get(key));
        }

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(map);
    }
}
