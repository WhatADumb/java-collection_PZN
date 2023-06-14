package study.java.self.app;

// import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new IdentityHashMap<>();
        //Map<String, String> map = new HashMap<>(); The result of size will be 3

        String key1 = "user.name";
        String key2 = "user.name";

        String user = "user";
        String dot = ".";
        String name = "name";

        String key3 = user + dot + name;

        System.out.println(key1.equals(key2));
        System.out.println(key1.equals(key3));

        System.out.println(key1 == key2);
        System.out.println(key1 == key3);

        map.put(key1, "Fadhil");
        map.put(key2, "Fadhil");
        map.put(key3, "Fadhil");

        System.out.println(map.size());
    }
}
