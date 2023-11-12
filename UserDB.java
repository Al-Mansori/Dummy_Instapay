/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dummy.instapay;

import java.util.Vector;

/**
 *
 * @author Medo
 */
public class UserDB {
    private static Vector<User> usersList ;

    public UserDB() {
        usersList = new Vector<User>();
    }
    
    public static void add(User user){
        usersList.add(user);
    }

    public static Vector<User> getUsersList() {
        return usersList;
    }
    
    public static boolean isUsernameExist(String username) {
        for (User user : UserDB.getUsersList()) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
    
    public static User findUserByUsername(String username) {
        for (User user : usersList) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null; // User not found (this should not happen if credentials were validated)
    }
    
    public static boolean isFoundWallet(String phoneNumber){
        for(User user : usersList ){
            if(user.getPhoneNumber().equals(phoneNumber)){
                return true ;
            }
        }
        return false;
    }
    
    public static boolean isFoundBankAccount(String bankNumber){
        for(User user : usersList ){
            if(user.getAccount().getID().equals(bankNumber)){
                return true ;
            }
        }
        return false;
    }
    
}
