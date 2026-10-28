package software.ulpgc.katas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public record User(String username, String password, String email) {
    // pattern for recognising the email pattern. must be static for a global usage in all user objects
    private final static String emailPattern = "\\w{1,}@\\w{1,}.\\w{2,3}";

    public boolean isValidEmail(){
        Pattern regex = Pattern.compile(emailPattern);
        Matcher matcher = regex.matcher(email);
        return (matcher.matches()) ? true : false;
    }
}
