import java.util.Scanner;
import dummy.instapay.AccountType;

public class Aoth {

    public Aoth() {

    }

    public User register() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User Name:");
        String userName = scanner.nextLine();

        System.out.println("Enter User Password:");
        String userPassword = scanner.next();

        System.out.println("Choose Account Type:");
        System.out.println("1. Bank Account");
        System.out.println("2. Wallet Account");

        int choice = scanner.nextInt();

        if (choice == 1) {

            System.out.print("Enter Bank Account Number: ");
            String accountNumber = scanner.next();
            System.out.print("Enter Initial Balance: ");
            double initialBalance = scanner.nextDouble();
            System.out.print("Enter User ID: ");
            int userId = scanner.nextInt();
            System.out.print("Enter Phone Number: ");
            String phoneNumber = scanner.next();

            BankAccount bankAccount = new BankAccount(accountNumber, initialBalance, userId, phoneNumber,
                    AccountType.bankAccount);

            User user = new User(userName, userPassword, bankAccount);
            sendOtp();
            return user;

        } else if (choice == 2) {

            System.out.print("Enter Initial Wallet Balance: ");
            double initialBalance = scanner.nextDouble();
            System.out.print("Enter User ID: ");
            int userId = scanner.nextInt();
            System.out.print("Enter Phone Number: ");
            String phoneNumber = scanner.next();

            Wallet wallet = new Wallet(initialBalance, userId, phoneNumber, AccountType.wallet);
            User user = new User(userName, userPassword, wallet);
            sendOtp();
            return user;

        } else {
            System.out.println("Invalid choice. Registration failed.");
            return null;
        }
    }

    public User login() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter User ID: ");
        int userId = scanner.nextInt();
        System.out.print("Enter User Password: ");
        String password = scanner.next();

        if (isUserValid(userId, password)) {
            sendOtp();
            return;

        } else {
            System.out.println("Login failed. Invalid credentials.");
            return null;
        }

    }

    private boolean isUserValid(int userId, String phoneNumber) {

        return true;
    }


}