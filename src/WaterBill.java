/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dummy.instapay;

/**
 *
 * @author Medo
 */
import java.util.Scanner;

public class WaterBill extends Bills {

    private WaterCompany waterCompany;
    
    public WaterCompany getWaterCompany() {
        return waterCompany;
    }

    @Override
    protected void setCompany() {
        
        System.out.println("choose your company: ");
        
        Scanner scanner = new Scanner(System.in);

        String company = scanner.next();

        waterCompany = WaterCompany.fromString(company);

    }

    @Override
    public void displayBill() {
        System.out.println("Company "+waterCompany.name());
        
        System.out.println("Water Consumed: ");

        System.out.println(this.totalConsumed);

    }
}
