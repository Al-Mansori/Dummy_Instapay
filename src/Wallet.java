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
        this.activities = new Operations();
    }

    public Wallet(double balance, int id, String phoneNumber, AccountType accountType) {
        super(balance, id, phoneNumber, accountType);
    }
    
    @Override
    public void loadProfile(){
        System.out.println("ID: "+this.id+"\nPhone Number: "+this.phoneNumber+"\nBalance: "+this.balance+"\nAccount Type: "+this.accountType);
    }
}
