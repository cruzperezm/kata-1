package software.ulpgc.katas;

import java.time.LocalDate;

public class Person {
    // private int age; no necesaria??
    private final String name;
    private final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
}
