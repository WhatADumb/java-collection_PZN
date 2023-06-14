package study.java.self.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;
    private List<String> hobbies;

    public Person(String name){
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public List<String> getHobbies() {
        return Collections.unmodifiableList(this.hobbies);
    }

    public void addHobbies(String hobby) {
        this.hobbies.add(hobby);
    }

    public String getName() {
        return this.name;
    }
}
