/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dummy.instapay;

/**
 *
 * @author Medo
 */
public class BankAccount extends Account{
    
    private String accountNumber ;
    
    public BankAccount(){
        this.operations = new BankAccountOperations();
    }

    public BankAccount(String accountNumber, double balance,  String id) {
        super(balance, id);
        this.accountNumber = accountNumber;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    @Override
    public void loadProfile(){
        System.out.println("Balance: "+this.balance+"\nAccount Number: "+this.accountNumber);
    }
}
