package study.java.self.app;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {
        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singular = Collections.singletonMap("key", "Value");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("data1", "one");
        mutable.put("data2", "two");
        mutable.put("data3", "three");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of("one", "first", "two", "second");
    }
}
