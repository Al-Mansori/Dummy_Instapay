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
    
    public void add(User user){
        usersList.add(user);
    }

    public Vector<User> getUsersList() {
        return usersList;
    }
    
    
}
