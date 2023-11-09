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

public abstract class Bills {
    private double totalConsumed;

    public void PayBill(){
        
    }
    
    public double calculateCost(){
        Random random = new Random();
        return random.nextInt(1000) + 20;
    }

    public double getTotalConsumed() {
        return totalConsumed;
    }

    public void setTotalConsumed() {
        this.totalConsumed = calculateCost();
    }

    public abstract void displayBill();

}
