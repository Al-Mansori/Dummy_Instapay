import java.util.Random;

public abstract class Bills {
    private double totalConsumed;

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
