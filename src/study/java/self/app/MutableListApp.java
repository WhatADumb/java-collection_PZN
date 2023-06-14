package study.java.self.app;

import java.util.List;

import study.java.self.data.Person;

public class MutableListApp {
    public static void main(String[] args) {
        Person person = new Person("Fadhil");
        
        person.addHobbies("Drawing");
        person.addHobbies("Reading");
        person.addHobbies("Programming");

        // doAboutHobbies(person.getHobbies()); Error

        for(var hobby : person.getHobbies()){
            System.out.println(hobby);
        }
    }

    public static void doAboutHobbies(List<String> hobby) {
        hobby.add("404");
    }
}
