package study.java.self.app;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {
        Map<String, String> hTab = new Hashtable<>();

        hTab.put("data-1", "satu");
        hTab.put("data-2", "dua");
        hTab.put("data-3", "tiga");

        for(String data : hTab.keySet()){
            System.out.println(hTab.get(data));
        }
    }
}
