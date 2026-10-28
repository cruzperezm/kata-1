package software.ulpgc.katas;
import java.time.LocalDate;

public class Main {
    static void main() {
        User user1 = new User("default_username", "1234", "default@email.com");
        User user2 = new User("another_default_username", "6789", "non_valid.email.com");
        User[] users = new User[]{user1, user2};
        for (User user : users){
            String string = "Username: %s\nPassword: %s\nIs the email valid? %b\nEmail: %s";
            System.out.println(String.format(string, user.username(), user.password(), user.isValidEmail(), user.email()));
        }
    }
}
