import java.util.Scanner;

public class WaterBill extends Bills {

    private double waterConsumed;

    public WaterCompany getWaterCompany() {
        return waterCompany;
    }

    public void setWaterCompany() {
        Scanner scanner = new Scanner(System.in);

        String company = scanner.next();

        waterCompany = WaterCompany.fromString(company);

    }

    private WaterCompany waterCompany;



    @Override
    public void displayBill() {
        System.out.println("Water Consumed: ");

        System.out.println(waterConsumed);

        System.out.println("choose your company: ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your company: ");

        setWaterCompany();






    }


}
