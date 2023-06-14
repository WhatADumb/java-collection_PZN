package study.java.self.app;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {
        List<String> setVector = new Vector<>();

        setVector.add("alpha");
        setVector.add("beta");
        setVector.add("celeron");

        for(String data : setVector){
            System.out.println(data);
        }
    }
}
