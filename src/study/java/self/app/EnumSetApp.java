package study.java.self.app;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;

public class EnumSetApp {
    public static enum Gender{
        MALE, FEMALE;
    }

    public static void main(String[] args) {
        Set<Gender> genders = EnumSet.allOf(Gender.class);
        // Set<Gender> genders = EnumSet.of(Gender.FEMALE); Pick only one

        for (Gender gender : genders) {
            System.out.println(gender);
        }
    }
}
