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

public class ElectricityBill extends Bills{
    private ElecCompany elecCompany;

    public ElectricityBill() {
        super();
    }

    @Override
    protected void setCompany() {
        System.out.println("choose your company: ");
        
        Scanner scanner = new Scanner(System.in);

        String company = scanner.next();
        
        elecCompany = ElecCompany.fromString(company);
    }


    @Override
    public void displayBill() {
        System.out.println("Company "+elecCompany.name());
        
        System.out.println("Electricity Consumed: ");

        System.out.println(this.totalConsumed);

    }
}
