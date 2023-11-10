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

    public Wallet(double balance, String id) {
        super(balance, id);
    }


    
    @Override
    public void setOperations(Operations operation){
    
    }
    
    @Override
    public void loadProfile(){
        System.out.println("Account ID: "+this.id+"\nBalance: "+this.balance);
    }
}
