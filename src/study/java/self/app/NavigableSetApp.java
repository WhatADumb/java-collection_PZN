package study.java.self.app;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();

        names.addAll(Set.of("Kamen Rider", "Ultraman", "Power Ranger", "Gundam", "Naruto", "Netflix", "XXI"));

        NavigableSet<String> descendingName = names.descendingSet();
        NavigableSet<String> netflix = names.headSet("Netflix", true);
        NavigableSet<String> xxi  = names.tailSet("Netflix", true);

        for(String name : xxi){
            System.out.println(name);
        }
    }
}
