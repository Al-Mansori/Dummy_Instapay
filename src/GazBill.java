import java.util.Scanner;

public class GazBill extends Bills{
    private double gazeConsumed;

    public GazCompany getGazCompany() {
        return gazCompany;
    }

    public void setGazCompany() {
        Scanner scanner = new Scanner(System.in);

        String company = scanner.next();

        gazCompany = GazCompany.fromString(company);
    }

    private GazCompany gazCompany;
    @Override
    public void displayBill() {
        System.out.println("Gaze Consumed: ");

        System.out.println(gazeConsumed);

        System.out.println("choose your company: ");

        setGazCompany();


    }

}
