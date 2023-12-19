/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dummy.instapay;

/**
 *
 * @author Medo
 */

public class RegisterWithBank extends Register{
    
    @Override
    protected User doRegister(String username, String password, String bankNumber , String phoneNumber) {
        if (!UserDB.isFoundBankAccount(bankNumber)){
            BankAccount bankAccount = new BankAccount(bankNumber,system.generateBalance(),bankNumber);
            User newUser = new User(username, password, phoneNumber , bankAccount);
            UserDB.add(newUser);
            return newUser;
        } else {
            System.out.println("Registration failed. Invalid or duplicate bank account.");
            return null;
        }
    }
}
