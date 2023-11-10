/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dummy.instapay;

/**
 *
 * @author Medo
 */
public class WalletOperations extends Operations {
    @Override
    public void transfer(String phoneNumber , Account accountFrom , double balance){
        if(!Verifications.isValidPhoneNumber(phoneNumber)){
            System.out.println("Error: invalid phone number");
        }
        else{
            if(accountFrom.balance < balance){
                System.out.println("Error: this amount > your balance");
            }
            else{
                if(UserDB.isFoundWallet(phoneNumber)){
                    for(User user : UserDB.getUsersList() ){
                        if(user.getAccount().getID().equals(phoneNumber)){
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

