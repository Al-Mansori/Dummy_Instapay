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
    private double elecConsumed;
    private ElecCompany elecCompany;

    public  ElecCompany getElecCompany() {
        return elecCompany;
    }

    public void setElecCompany() {
        Scanner scanner = new Scanner(System.in);

        String company = scanner.next();

        elecCompany = ElecCompany.fromString(company);
    }


    @Override
    public void displayBill() {
        System.out.println("Electricity Consumed: ");

        System.out.println(elecConsumed);

        System.out.println("choose your company: ");

        setElecCompany();

    }
}
