package software.ulpgc.katas;
import java.time.LocalDate;

public class Main {
    static void main() {
        LocalDate birthday = LocalDate.of(2000, 1, 1);
        Person person = new Person("Pablo", birthday);
        String string = "Nombre: %s\nEdad: %d\nFecha de nacimiento: \"";
        System.out.println(String.format(string + person.birthday(), person.name(), person.age()));
    }
}
