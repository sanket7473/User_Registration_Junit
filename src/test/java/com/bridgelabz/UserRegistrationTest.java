package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
/*
@desc : UserRegistrationTest is tto do a unit testing.
**/
public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

  /*given_first_name_is_vailid method is testing a first name*/
    @Test
    public void given_first_name_is_vailid(){
        boolean a = userRegistration.validateFirstName("Sanket");
        boolean b = userRegistration.validateFirstName("sanket");
        Assert Assertions = null;
        Assertions.assertTrue(a);
        Assertions.assertFalse(b);

    }
    /*given_last_name_is_valid method is testing a last name*/
    @Test
    public void given_last_name_is_valid()
    {
        boolean a =userRegistration.validateLastName("Garde");
        boolean b=userRegistration.validateLastName("garde");
        Assertions.assertTrue(a);
        Assertions.assertFalse(b);
    }
    /*given_email_id_is_valid method is testing a email id*/
 @Test
    public void given_email_id_is_valid()
 {
     boolean a=userRegistration.validateEmailid("sanketgarde7472@gmail.com");
     boolean b=userRegistration.validateEmailid("sanket.gmail.com");
     Assertions.assertTrue(a);
     Assertions.assertFalse(b);
 }

    /*given_mobile_number_is_valid method is testing a mobile number*/
@Test
public void given_mobile_number_is_valid()
{
    boolean a=userRegistration.validateMobileno("7558797579");
    boolean b=userRegistration.validateMobileno("755879757");
    Assertions.assertTrue(a);
    Assertions.assertFalse(b);
}

/*given_password_is_valid method is testing a password */
    @Test
public void given_password_is_valid()
{
    boolean a=userRegistration.validatePassword("Sanketgarde@123");
    boolean b=userRegistration.validatePassword("sanket");
    Assertions.assertTrue(a);
    Assertions.assertFalse(b);
}

}
