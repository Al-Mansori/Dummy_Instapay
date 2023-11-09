/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dummy.instapay;

/**
 *
 * @author Medo
 */
public class BankAccountOperations extends Operations {
    
    public void transfer(String accountNumber , Account accountFrom , double balance){
        if(accountFrom.getBalance() < balance){
            System.out.println("Error: this amount > your account balance");
        }
        else{
            
        }
    } 
    
}
