/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dummy.instapay;

/**
 *
 * @author Medo
 */
import java.util.Random;
import java.util.Scanner;

public abstract class Bills {
    protected double totalConsumed;

    public Bills() {
        totalConsumed = calculateCost();
    }

    public void PayBill(Account account){
        if(this == null){
            
        }
        else{
            this.setCompany();
            pay(account,this);
        }
    }
    
    public static Bills chooseBillType(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n1.Electricity Bill\n2.Water Bill\n3.Gas Bill\nWhich bill you want to pay (Note: Enter bill number): ");
        int x = input.nextInt();
        Bills bill ;
        if(x == 1){
            bill = new ElectricityBill() ;
        }
        else if(x == 2){
            bill = new WaterBill() ;
        }
        else if(x == 3){
            bill = new GazBill() ;
        }
        else{
            System.out.println("Error: wrong input");
            bill = null ;
        }
        return bill ;
    }
    
    private boolean pay(Account account, Bills bill){
        if(account.getBalance() < bill.getTotalConsumed()){
            System.out.println("you can't pay this bill as your balance < total consumed");
            return false;
        }
        else{
            account.setBalance(account.getBalance() - bill .getTotalConsumed());
            System.out.println("Bill payed successfully");
            return true;
        }
    }
    
    
    private double calculateCost(){
        Random random = new Random();
        return random.nextInt(1000) + 20;
    }

    public double getTotalConsumed() {
        return totalConsumed;
    }

    protected abstract void setCompany();
    
    public abstract void displayBill();

}
