/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dummy.instapay;

/**
 *
 * @author Medo
 */
public class Wallet extends Account{

    public Wallet(){
        this.operations = new WalletOperations();
    }

    public Wallet(double balance, String phoneNumber, AccountType accountType) {
        super(balance, phoneNumber, accountType);
    }
    
    @Override
    public void loadProfile(){
        System.out.println("Phone Number: "+this.phoneNumber+"\nBalance: "+this.balance+"\nAccount Type: "+this.accountType);
    }
}
