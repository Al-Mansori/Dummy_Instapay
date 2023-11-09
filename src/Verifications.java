/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 
/**
 *
 * @author Medo
 */
public class Verifications {
    private Api api= new Api(); 
    private UserDB userdb ;

    

    public static boolean isValidPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            return false;
        }

        String[] validPrefixes = new String[] { "010", "011", "012", "015" };
        boolean isValidPrefix = false;
        for (String prefix : validPrefixes) {
            if (phoneNumber.startsWith(prefix)) {
                isValidPrefix = true;
                break;
            }
        }

        if (!isValidPrefix) {
            return false;
        }

        // The phone number is valid
        return true;
    }

    public  boolean isFoundAccountID(String accID) {
       
        for (String i : api.getAcountBankList()) {
            if(accID.equals(i)){
                return true;
            }

        }
       return false;
    }
}
