/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dummy.instapay;

/**
 *
 * @author Medo
 */
public class RegisterWithWallet extends Register{

    @Override
    protected User doRegister(String username, String password, String phoneNumber ,String phone ) {
        if (!UserDB.isFoundWallet(phoneNumber)) {
            Wallet wallet = new Wallet(system.generateBalance(),phoneNumber);
            User newUser = new User(username, password, phoneNumber, wallet);
            UserDB.add(newUser);
            return newUser;
        } else {
            System.out.println("Wallet already registered. Registration aborted.");
            return null;
        }
    }
}
