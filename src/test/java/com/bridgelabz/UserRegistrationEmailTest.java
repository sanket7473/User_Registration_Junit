package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
/*
UserRegistrationEmailTest is a class contains a parameterizedTest to validate the emails..
 */
public class UserRegistrationEmailTest {
    UserRegistration userRegistration = new UserRegistration();
    @ParameterizedTest
    @CsvSource({
            "abc-100@yahoo.com,true",
            "abc.100@yahoo.com,true",
            "abc111@abc.com,true",
            "abc-100@abc.net,true",
            "abc.100@abc.com.au,true",
            "abc@1.com,true" ,
            "abc@gmail.com.com,true",
            "abc+100@gmail.com,true"})

        //testEmailValidation will validate the email for the valid emails.
    void testEmailValidation(String emailAdd) {
        boolean isValid = userRegistration.validEmail(emailAdd);
        Assertions.assertTrue(isValid);
    }


    @ParameterizedTest
    @CsvSource({"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",
            ".abc@abc.com","abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com","abc..2002@gmail.com",
            "abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"})

//testInvalidEmail will validate the email for the invalid emails.
    void testInvalidEmail(String email){
        boolean isInvalid=userRegistration.validEmail(email);
        Assertions.assertFalse(isInvalid);
    }
}
