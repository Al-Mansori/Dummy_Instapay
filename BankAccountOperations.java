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
    
    @Override
    public void transfer(String accountNumber , Account accountFrom , double balance){
        if(!Verifications.isFoundBankID(accountNumber)){
            System.out.println("Error: invalid bank account");
        }
        else{
            if(accountFrom.balance < balance){
                System.out.println("Error: this amount > your balance");
            }
            else{
                if(Verifications.isFoundBankAccount(accountNumber)){
                    for(User user : Verifications.getDb().getUsersList() ){
                        if(user.getAccount().getID().equals(accountNumber)){
                            accountFrom.setBalance(accountFrom.getBalance() - balance);
                            user.getAccount().setBalance(user.getAccount().getBalance() + balance);
                            System.out.println("transfer successfully");
                            return ;
                        }
                    }
                }
                else{
                    accountFrom.setBalance(accountFrom.getBalance() - balance);
                    System.out.println("transfer successfully");
                }
            }
        }
    }
    
}
