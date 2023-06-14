package study.java.self.app;

import java.util.Arrays;
import java.util.List;

public class ConversionArrayApp {
    public static void main(String[] args) {
        List<String> sample = List.of("Alpha", "Beta", "Code");

        Object[] namesObj = sample.toArray();
        String[] namesStr = sample.toArray(new String[]{});

        System.out.println(Arrays.toString(namesObj) + " By Object");
        System.out.println(Arrays.toString(namesStr) + " By String");
    }
}
