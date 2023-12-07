package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *@desc User_Registration_Pattern class is checking a validation for user registration
 */
public class UserRegistration {


    /*
     *@desc validateFirstName method is validating the first name
     * @param FirstName is a first name passed to the validateFirstName function to check validation
     * @return isvalid is will true or false if conditions are true or false
     */
    public boolean validateFirstName(String FirstName) throws InvalidInputException {
        boolean isValid = FirstName.matches("[A-Z][a-z]{3,10}");
        if (isValid) {
            System.out.println("First name is valid");
        } else {
            throw new InvalidInputException("This is a invalid first name");
        }
        return isValid;
    }

    /*
     * validateLastName method is validating the last name
     * @param lastName  is a last name passed to the validateLastName function to check validation
     * @return isValidLastName is will true or false if conditions are true or false
     */

    public boolean validateLastName(String lastName) throws InvalidInputException {
        boolean isValidLastName = lastName.matches("[A-Z][a-z]{3,10}");
        if (isValidLastName) {
            System.out.println("Last name is valid");
        }
        else {
            throw new InvalidInputException("This is a invalid last name");
        }
        return isValidLastName;
    }



    /*
     * @desc: validateMobileno method is validating the mobile number
     * @param mobNo is a parameter for  validateMobileno  to check validation for mobile number
     * @return isValidMobileNumber will true or false if condition are true or false
     */
    public boolean validateMobileno(String mobNo) throws InvalidInputException {
        boolean isValidMobileNumber = mobNo.matches("^(\\+91[ ])?\\d{10}$");
        if (isValidMobileNumber) {
            System.out.println("mobile number is valid");
        }
        else
        {
            throw new InvalidInputException("This is a invalid mobile number");
        }
        return isValidMobileNumber;
    }
    /*
     * @desc: validatePassword method is validating the password should have minimum 8 characters and one Upper case one number one special character
     * @param password is a parameter for the validatePassword to check validation for password
     * @return validatePassword will true or false if condition are true or false
     */
    public boolean validatePassword(String password) throws InvalidInputException  {
        boolean isValidPassword = password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
        if (isValidPassword) {
            System.out.println("password is valid");
        }
        else
        {
            throw new InvalidInputException("This is a invalid password");
        }
        return isValidPassword;
    }
    /*
     * @desc: validateEmailid method is validating the last name
     * @param email  is a email id to validateEmail function
     * @return isValidEmail will true or false if conditions are true or false
     */
    public boolean validateEmailid(String EmailId) throws InvalidInputException{
        boolean isValidEmail = EmailId.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$");
        if (isValidEmail) {
            System.out.println("Email name is valid");
        }
        else
        {
            throw new InvalidInputException("This is a invalid Email id");
        }
        return isValidEmail;
    }
    public boolean validEmail(String email){
        Pattern pattern = Pattern.compile("^[a-z]{3}@[a-z]{2,}.[a-z]{3,}$");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }
        pattern = Pattern.compile("^[a-z]{3}-[0-9]{3}@[a-z]{3,}.[a-z]{2,}$");
        matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }

        pattern = Pattern.compile("^[a-z]{3}.[0-9]{3}@[a-z]{3,}.[a-z]{2,}$");
        matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }
        pattern = Pattern.compile("^[a-z0-9]{2,}@[a-z]{3}.[a-z]{2,}$");
        matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }
        pattern = Pattern.compile("^[a-z]{2,}-[0-9]{2,}@[a-z]{2,}.[a-z]{2,}");
        matcher= pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }
        pattern = Pattern.compile("^[a-z]{3}.[0-9]{3}@[a-z]{3}.[a-z]{3}.[a-z]{2}$");
        matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }

        pattern = Pattern.compile("^[a-z]{3}@[a-z]{2,}.[a-z]{3}.[a-z]{3}$");
        matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }
        pattern = Pattern.compile("[a-z]{3,}[+]\\d{2,}@[a-z]{2,}.[a-z]{3,}");
        matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }
        pattern = Pattern.compile("^[a-z]{2,}@[0-9]{1,}.[a-z]{2,}$");
        matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }

        return false;
    }

}
