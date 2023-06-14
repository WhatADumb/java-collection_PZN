package study.java.self.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDefaultMethodApp {
    public static void main(String[] args) {
        Map<String, String> data = new HashMap<>();

        data.put("key-1", "alpha");
        data.put("key-2", "beta");
        data.put("key-3", "celeron");

        data.forEach(new BiConsumer<String, String>() {
            public void accept(String t, String u) {
                System.out.println(t + " : " + u);
            };
        });
    }
}
