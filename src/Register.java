/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dummy.instapay;

/**
 *
 * @author Medo
 */

import java.util.Random;

public abstract class Register {
    public User register(String username, String password, String id ,String phoneNumber) {
        if (!UserDB.isUsernameExist(username)) {
            return doRegister(username, password, id,phoneNumber);
        } else {
            System.out.println("Registration failed. this uesername is taken.");
            return null;
        }
    }
    
    protected abstract User doRegister(String username, String password, String id ,String phoneNumber );

}
