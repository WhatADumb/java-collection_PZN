package study.java.self.app;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

import study.java.self.data.Person;
import study.java.self.data.PersonComparator;

public class SortedSetApp {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());

        people.add(new Person("Ahmad"));
        people.add(new Person("Joko"));
        people.add(new Person("Zeta"));

        for(Person data : people){
            System.out.println(data.getName()   );
        }

        //Making a SortedSet to be Immutable
        SortedSet<Person> data = Collections.unmodifiableSortedSet(people);
        data.add(new Person("Bagus")); //Will be error, because already immutable
    }
}
