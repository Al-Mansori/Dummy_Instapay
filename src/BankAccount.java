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
        this.operations = new BankAccountOperations();
    }
    
    @Override
    public void setOperations(Operations operation){
        this.operations = operation ;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
}
