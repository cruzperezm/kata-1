package software.ulpgc.katas;
import java.time.LocalDate;

public class Main {
    static void main() {
        LocalDate birthday1 = LocalDate.of(2000, 1, 1);
        Person person1 = new Person("Pablo", birthday1);
        LocalDate birthday2 = LocalDate.of(2010, 1, 1);
        Person person2 = new Person("Paula", birthday2);
        Person[] people = new Person[]{person1, person2};
        for (Person person : people){
            String string = "Nombre: %s\nEdad: %d\nFecha de nacimiento:";
            String mayor = (person.isOfAge()) ? "Sí" : "No";
            System.out.println(String.format(string + person.birthday() + "\nEs mayor de edad? %s", person.name(), person.age(), mayor));
        }
    }
}
