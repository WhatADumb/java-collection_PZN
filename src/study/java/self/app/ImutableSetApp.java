package study.java.self.app;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> singular = Collections.singleton("Sample");

        Set<String> mutable = new HashSet<>();
        mutable.add("Data 1");
        mutable.add("Data 2");
        mutable.add("Data 3");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> data = Set.of("Sample 1", "Sample 2", "Sample 3");
        // data.add("Not Data"); Error
        // data.remove("Data 1"); Error
    }
}
