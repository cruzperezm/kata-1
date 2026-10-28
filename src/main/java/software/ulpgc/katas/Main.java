package software.ulpgc.katas;
import java.time.LocalDate;

public class Main {
    static void main() {
        LocalDate birthday = LocalDate.of(2000, 1, 1);
        Person person = new Person("Pablo", birthday);
        String name = "Nombre: %s";
        String age = "Edad: %d";
        String bday = "Fecha de nacimiento: ";
        System.out.println(String.format(name, person.name()));
        System.out.println(String.format(age, person.age()));
        System.out.println(String.format(bday + person.birthday()));
    }
}
