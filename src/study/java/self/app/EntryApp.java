package study.java.self.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class EntryApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("code-1", "alpha");
        map.put("code-2", "beta");
        map.put("code-3", "celeron");

        Set<Map.Entry<String, String>> dataMap = map.entrySet();

        for(var data : dataMap){
            System.out.println(data.getKey() + " : " + data.getValue());
        }
    }
}
