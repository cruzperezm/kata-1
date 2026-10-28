package software.ulpgc.katas;

import java.time.LocalDate;

public record Person(String name, LocalDate birthday) {
    private final static double DAYS_PER_YEAR = 365.25;

    public int toYears(long days) {
        return (int) (days / DAYS_PER_YEAR);
    }

    public int age() {
        return toYears(LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }
}
