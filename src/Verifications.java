/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dummy.instapay;

/**
 *
 * @author Medo
 */
public class Verifications {
    private static UserDB db ;
    private static BankApi api;

    public Verifications() {
        db = new UserDB();
        api = new BankApi();
    }
    
    public static boolean isValidPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            return false;
        }

        String[] validPrefixes = new String[] {"010", "011", "012", "015"};
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
    
    public static boolean isValidBankAccount(String bankNumber){
        if(bankNumber.length() == 11){
            return true;
        }
        return false ;
    }
    
    public static boolean isFoundBankID(String bankNumber){
        for(String bn : api.getBankNumbersList()){
            if(bankNumber.equals(bn)){
                return true ;
            }
        }
        return false ;
    }
    
    public static boolean isFoundWallet(String phoneNumber){
        for(User user : db.getUsersList() ){
            if(user.getAccount().getPhoneNumber().endsWith(phoneNumber)){
                return true ;
            }
        }
        return false;
    }
}
