package ch.zhaw.iwi.devops.emailValidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailValidatorTest {
    
    @Test
    public void emailValidatorTestOne(){
        EmailValidator validator = new EmailValidator();
        String email = "";
        Assertions.assertFalse(validator.validateEmail(email));
    }

    @Test
    public void emailValidatorTestTwo(){
        EmailValidator validator = new EmailValidator();
        String email = "test@";
        Assertions.assertFalse(validator.validateEmail(email));
    }

    @Test
    public void emailValidatorTestThree(){
        EmailValidator validator = new EmailValidator();
        String email = "@test";
        Assertions.assertFalse(validator.validateEmail(email));
    }

    @Test
    public void emailValidatorTestFour(){
        EmailValidator validator = new EmailValidator();
        String email = "@test.com";
        Assertions.assertFalse(validator.validateEmail(email));
    }
    @Test
    public void emailValidatorTestFive(){
        EmailValidator validator = new EmailValidator();
        String email = "@.com";
        Assertions.assertFalse(validator.validateEmail(email));
    }

    @Test
    public void emailValidatorTestSix(){
        EmailValidator validator = new EmailValidator();
        String email = "testmail.com";
        Assertions.assertFalse(validator.validateEmail(email));
    }
    @Test
    public void emailValidatorTestSeven(){
        EmailValidator validator = new EmailValidator();
        String email = "test@mail.ch.com";
        Assertions.assertTrue(validator.validateEmail(email));
    }
    @Test
    public void emailValidatorTestEight(){
        EmailValidator validator = new EmailValidator();
        String email = "test @mail.com";
        Assertions.assertFalse(validator.validateEmail(email));
    }

    @Test
    public void emailValidatorTestNine(){
        EmailValidator validator = new EmailValidator();
        String email = "test@mail.com";
        Assertions.assertTrue(validator.validateEmail(email));
    }

    @Test
    public void emailValidatorTestTen(){
        EmailValidator validator = new EmailValidator();
        String email = "test123@mail.com";
        Assertions.assertTrue(validator.validateEmail(email));
    }


}
