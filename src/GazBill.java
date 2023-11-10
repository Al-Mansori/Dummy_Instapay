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

public class GazBill extends Bills{
    private double gazeConsumed;
    private GazCompany gazCompany;

    public GazCompany getGazCompany() {
        return gazCompany;
    }

    public void setGazCompany() {
        
        System.out.println("choose your company: ");
        
        Scanner scanner = new Scanner(System.in);

        String company = scanner.next();

        gazCompany = GazCompany.fromString(company);
    }

    @Override
    public void displayBill() {
        System.out.println("Gaze Consumed: ");

        System.out.println(gazeConsumed);

    }

}
