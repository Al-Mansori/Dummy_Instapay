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
import java.util.Scanner;

public class Authentication {
    private Register register ;

    public Authentication(){
        
    }
    
    public Authentication(Register register) {
        this.register = register;
    }
  
    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register =  register;
    }
    
    public User login(String username,String password) {

        if (UserDB.isMatches(username, password)) {
            System.out.println("Login successful!");
            return UserDB.findUserByUsername(username);

        } else {
            System.out.println("Login failed. Invalid credentials.");
            return null;
        }

    }

    public static int generateRandomOtp() {
        return 12345;
    }

}
