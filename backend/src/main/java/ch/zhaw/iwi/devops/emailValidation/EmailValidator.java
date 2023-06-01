package ch.zhaw.iwi.devops.emailValidation;

import java.util.regex.Pattern;

public class EmailValidator {

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private static final Pattern pattern = Pattern.compile(EMAIL_REGEX);

    public boolean validateEmail(String email) {
        return pattern.matcher(email).matches();
    }

}
