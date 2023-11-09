import java.util.Scanner;

public class ElectricityBill extends Bills{
    private double elecConsumed;

    public  ElecCompany getElecCompany() {
        return elecCompany;
    }

    public void setElecCompany() {
        Scanner scanner = new Scanner(System.in);

        String company = scanner.next();

        elecCompany = ElecCompany.fromString(company);
    }

    private ElecCompany elecCompany;

    @Override
    public void displayBill() {
        System.out.println("Electricity Consumed: ");

        System.out.println(elecConsumed);

        System.out.println("choose your company: ");

        setElecCompany();

    }
}
