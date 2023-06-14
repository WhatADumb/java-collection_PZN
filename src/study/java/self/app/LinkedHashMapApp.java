package study.java.self.app;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("first", "This is first");
        map.put("second", "This is second");
        map.put("third", "This is third");

        Set<String> keys = map.keySet();

        for(var key : keys){
            System.out.println(map.get(key));
        }
    }
}
