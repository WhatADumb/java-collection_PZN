package study.java.self.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImutableListApp {
    public static void main(String[] args) {
        List<String> dataSingle = Collections.singletonList("Singular");
        List<String> dataEmpty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Satu");
        mutable.add("Dua");
        mutable.add("Tiga");
        List<String> imutable = Collections.unmodifiableList(mutable);

        List<String> data = List.of("Data1", "Data2", "Data3");
        // data.add("Data4"); Error
    }
}
