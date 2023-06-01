package ch.zhaw.iwi.devops.emailValidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailValidatorTest {
    
    @Test
    public void emailValidatorTestOne(){
        EmailValidator validator = new EmailValidator();
        String email = "";
        Assertions.assertFalse(validator.validateEmail(email), null);
    }
}
