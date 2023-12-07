package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
/*
@desc : UserRegistrationTest is tto do a unit testing.
UC10: Testing cases using a junit.
**/
public class UserRegistrationTest {


    UserRegistration userRegistration = new UserRegistration();
    Assert Assertions = null;
  /*given_first_name_is_vailid method is testing a first name*/
    @Test
    public void given_first_name_is_vailid(){
        boolean isNamevalid;
        boolean isNameInvalid;
        try
        {
            isNamevalid = userRegistration.validateFirstName("Sanket");
        }
        catch (InvalidInputException e)
        {
            System.out.println("Exception"+e.getMessage());
            isNamevalid = false;
        }

        try
        {
            isNameInvalid = userRegistration.validateFirstName("sanket");
            System.out.println("First name is invalid");

        }
        catch(InvalidInputException e)
        {
            System.out.println("Exception"+e.getMessage());
            isNameInvalid = false;
        }
        Assertions.assertTrue(isNamevalid);
        Assertions.assertFalse(isNameInvalid);

    }
    /*given_last_name_is_valid method is testing a last name*/
    @Test
    public void given_last_name_is_valid()
    {
        boolean isValidLastName;
        boolean isInvalidLastName;
        try {
            isValidLastName = userRegistration.validateLastName("Garde");
        }
        catch(InvalidInputException e)
        {
            System.out.println("Exception: " + e.getMessage());
            isValidLastName = false;
        }
        try {

            isInvalidLastName=userRegistration.validateLastName("garde");
            System.out.println("Last name is  invalid");
        }
        catch(InvalidInputException e)
        {
            System.out.println("Exception: " + e.getMessage());
            isInvalidLastName = false;
        }
        Assertions.assertTrue(isValidLastName);
        Assertions.assertFalse(isInvalidLastName);
    }
    /*given_email_id_is_valid method is testing a email id*/
 @Test
    public void given_email_id_is_valid()
 {
     boolean isEmailValid;
     boolean isEmailInvalid=false;
     try
     {
         isEmailValid=userRegistration.validateEmailid("sanketgarde7472@gmail.com");
     }catch(InvalidInputException e)
     {
         System.out.println("Exception :"+e.getMessage());
         isEmailValid=false;
     }
     try
     {
         isEmailInvalid=userRegistration.validateEmailid("sanket.gmail.com");
     }
     catch(InvalidInputException e)
     {
         System.out.println("Exception"+e.getMessage());
         isEmailInvalid=false;
     }


     Assertions.assertTrue(isEmailValid);
     Assertions.assertFalse(isEmailInvalid);
 }

    /*given_mobile_number_is_valid method is testing a mobile number*/
@Test
public void given_mobile_number_is_valid()
{
    boolean isMobilevalid;
    boolean isMobileInvalid;
try
{
    isMobilevalid=userRegistration.validateMobileno("7558797579");

}catch(InvalidInputException e)
{
    System.out.println("Exception"+e.getMessage());
    isMobilevalid=false;
}
try
{
    isMobileInvalid=userRegistration.validateMobileno("755879757");
}catch(InvalidInputException e)
{
    System.out.println("Exception"+e.getMessage());
    isMobileInvalid=false;

}

    Assertions.assertTrue(isMobilevalid);
    Assertions.assertFalse(isMobileInvalid);
}

/*given_password_is_valid method is testing a password */
    @Test
public void given_password_is_valid()
{
    boolean isvalidPassword;
    boolean isInvalidPassword;
    try
    {
        isvalidPassword=userRegistration.validatePassword("Sanketgarde@123");
    }catch(InvalidInputException e)
    {
        System.out.println("Exception"+e.getMessage());
        isvalidPassword=false;
    }
    try
    {
         isInvalidPassword=userRegistration.validatePassword("sanket");
    }
    catch(InvalidInputException e)
    {
        System.out.println("Exception"+e.getMessage());
        isInvalidPassword=false;
    }

    Assertions.assertTrue(isvalidPassword);
    Assertions.assertFalse(isInvalidPassword);
}

}
