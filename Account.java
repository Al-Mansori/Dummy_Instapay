/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dummy.instapay;

/**
 *
 * @author Medo
 */
public abstract class Account {
    protected double balance ;
    protected String id ;
    protected Operations operations ;
    
    public abstract void loadProfile();
    
    public Account(){
        
    }

    public Account(double balance, String id) {
        this.balance = balance;
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getID(){
        return id ;
    }

    public void setID(String id) {
        this.id = id;
    }

    public Operations getOperations() {
        return operations;
    }

    public void setOperations(Operations operations) {
        this.operations = operations;
    }
    
}
