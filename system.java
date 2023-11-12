/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dummy.instapay;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Medo
 */
public class system {
    private UserDB db ;
    private BankApi api ;
    private Authentication authentication ;

    public system() {
        db = new UserDB();
        api = new BankApi();
        authentication = new Authentication();
    }
    
    public static double generateBalance(){
        Random random = new Random();
        return random.nextInt(1000) + 20;
    }
    
    public User mainUI(){
        Scanner input = new Scanner(System.in);
        System.out.print("1.sign up\n2.sign in\n3.exit\nEnter your choice: ");
        int x = input.nextInt();
        if(x == 1){
            System.out.print("1.Wallet\n2.Bank Account\nwhich way you want to regiser with: ");
            x = input.nextInt();
            if(x == 1){
                Register register = new RegisterWithWallet() ;
                authentication.setRegister(register) ;
                System.out.print("enter your phone number: ");
                String phoneNumber = input.next();
                if(Verifications.isValidPhoneNumber(phoneNumber)){
                    System.out.print("enter your otp: ");
                    x = input.nextInt();
                    if(x ==12345){
                        System.out.print("enter username: ");
                        String username = input.next();
                        System.out.print("enter password : ");
                        String password = input.next();
                        return authentication.getRegister().register(username, password, phoneNumber, phoneNumber);
                    }
                    else{
                        System.out.println("invalid otp");
                    }
                }
                else{
                    System.out.println("invalid Phone Number");
                }
                return null;
            }
            else if(x == 2){
                Register register = new RegisterWithBank() ;
                authentication.setRegister(register) ;
                System.out.print("enter your phone number: ");
                String phoneNumber = input.next();
                if(Verifications.isValidPhoneNumber(phoneNumber)){
                    System.out.print("enter your bank number: ");
                    String bankNumber = input.next();
                    if(BankApi.isFoundBankID(bankNumber) && Verifications.isValidBankAccount(bankNumber) ){
                        System.out.print("enter your otp: ");
                        x = input.nextInt();
                        if(x == 12345){
                            System.out.print("enter username: ");
                            String username = input.next();
                            System.out.print("enter password : ");
                            String password = input.next();
                            return authentication.getRegister().register(username, password, phoneNumber, phoneNumber);
                        }
                        else{
                            System.out.println("invalid otp");
                        }
                    }
                    else{
                        System.out.println("invalid bank number");
                    }
                }
                else{
                    System.out.println("invalid Phone Number");
                }
                return null ;
            }
            else{
                System.out.println("Error input");
                return null;
            }
        }
        else if(x == 2){
            System.out.print("enter username: ");
            String username = input.next();
            System.out.print("enter password : ");
            String password = input.next();
            return authentication.login(username, password);
        }
        else if(x == 3){
            System.exit(0);
            return null ;
        }
        else{
            System.out.println("Error input");
            return null ;
        }
    }
    
    public void userUI(User user){
        if(user == null){
            return ;
        }
        else{
            Scanner input = new Scanner(System.in);
            while(true){
                if(user.getAccount() instanceof BankAccount){
                    System.out.print("1.Transfer to Wallet\n2.Transfer to Bank Account\n3.Inquire about balance\n4.pay Bills\n5.logout\n6.exit\nEnter your choice: ");
                    int x = input.nextInt();
                    if(x == 1){
                        System.out.print("enter phone number to transfer to: ");
                        String phoneNumber = input.next();
                        System.out.print("enter balance to transfer: ");
                        double balance = input.nextDouble();
                        user.getAccount().setOperations(new WalletOperations());
                        user.getAccount().getOperations().transfer(phoneNumber, user.getAccount(), balance);
                    }
                    else if(x == 2){
                        System.out.print("enter Bank Account number to transfer to: ");
                        String bankNumber = input.next();
                        System.out.print("enter balance to transfer: ");
                        double balance = input.nextDouble();
                        user.getAccount().setOperations(new BankAccountOperations());
                        user.getAccount().getOperations().transfer(bankNumber, user.getAccount(), balance);
                    }
                    else if(x == 3){
                        System.out.println("your balance: "+user.getAccount().getBalance());
                    }
                    else if(x == 4){
                        Bills bill = Bills.chooseBillType();
                        bill.displayBill();
                        System.out.println("do you want to pay (y or n): ");
                        char answer = input.next().charAt(0);
                        if(answer == 'y'){
                            bill.PayBill(user.getAccount());
                        }
                    }
                    else if(x == 5){
                        return;
                    }
                    else if(x == 6){
                        System.exit(0);
                    }
                    else{
                        System.out.println("Error input");
                    }
                }
                else{
                    System.out.print("1.Transfer to Wallet\n2.Inquire about balance\n3.pay Bills\n4.logout\n5.exit\nEnter your choice: ");
                    int x = input.nextInt();
                    if(x == 1){
                        System.out.print("enter phone number to transfer to: ");
                        String phoneNumber = input.next();
                        System.out.print("enter balance to transfer: ");
                        double balance = input.nextDouble();
                        user.getAccount().getOperations().transfer(phoneNumber, user.getAccount(), balance);
                    }
                    else if(x == 2){
                        System.out.println("your balance: "+user.getAccount().getBalance());
                    }
                    else if(x == 3){
                        Bills bill = Bills.chooseBillType();
                        bill.displayBill();
                        System.out.println("do you want to pay (y or n): ");
                        char answer = input.next().charAt(0);
                        if(answer == 'y'){
                            bill.PayBill(user.getAccount());
                        }
                    }
                    else if(x == 4){
                        return;
                    }
                    else if(x == 5){
                        System.exit(0);
                    }
                    else{
                        System.out.println("Error input");
                    }
                }
            }   
        }
    }
}
