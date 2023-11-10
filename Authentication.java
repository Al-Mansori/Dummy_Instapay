package dummy.instapay;

import java.util.Scanner;

public class Authentication {
    UserDB userDB = new UserDB();

    private boolean isMatches(String username, String password) {
        for (User user : userDB.getUsersList()) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;

    }

    public User login() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter User ID: ");
        String username = scanner.next();
        System.out.print("Enter User Password: ");
        String password = scanner.next();

        if (isMatches(username, password)) {
            System.out.println("Login successful!");
            return findUserByUsername(username);

        } else {
            System.out.println("Login failed. Invalid credentials.");
            return null;
        }

    }

    public static void sendOtp() {

        int otp = generateRandomOtp();

        System.out.println("Your OTP is: " + otp);
    }

    public static int generateRandomOtp() {

        return 12345;

        Random random = new Random();
        return 100000 + random.nextInt(900000);
    }

}
