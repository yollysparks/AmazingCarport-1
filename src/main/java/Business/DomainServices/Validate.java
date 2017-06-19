/*
 * A class that validates user inputs
 * v. 0.1
 * 
 */
package Business.DomainServices;

import java.util.regex.*;

/**
 *
 * @author ivoni
 */
public class Validate{

    public static boolean Validation(String email, String password1, String password2,
            String firstName, String lastName, String phone, String zip)
    {
        if(Email(email) == false) return false;
        if(password1.equals(password2)) return false;
        if(Password(password1) == false) return false;
        if(Name(firstName) == false) return false;
        if(Name(lastName) == false) return false;
        if(Phone(phone) == false) return false;
        if(Zip(zip) == false) return false;
        return true;
    }
    
    //Checks if the input is a valid email address.
    public static boolean Email(String input) {
        Pattern  p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
       if(input != null){
            Matcher m = p.matcher(input);
        return m.find();
       }    
       return false;
}
   
    public static boolean Password(String input){
            Pattern p = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}", Pattern.CASE_INSENSITIVE);
            if (input != null) {
                Matcher m = p.matcher(input);
                return m.find();
            }
            return false;
    }

    public static boolean Name(String input){
            Pattern p = Pattern.compile("^[a-zA-Z ]*$", Pattern.CASE_INSENSITIVE);
                if (input != null) {
                Matcher m = p.matcher(input);
                return m.find();
            }
            return false;
}
    //Phone() returns true, when the input is a string with 8 digits(and only digits)
    // or more.
    public static boolean Phone(String input){
           Pattern p = Pattern.compile("(?=.*[0-9])(?=\\S+$).{8,}");
           if (input != null) {
                Matcher m = p.matcher(input);
                return m.find();
            }
            return false;
    }
    
    // Zip only checks for Danish zip code in the format of (####), where # can
    // Only be a decimal digit.
    public static boolean Zip(String input){
        Pattern p = Pattern.compile("(?=.*[0-9])(?=\\S+$).{4,}");
           if (input != null) {
                Matcher m = p.matcher(input);
                return m.find();
            }
            return false;
    }
}