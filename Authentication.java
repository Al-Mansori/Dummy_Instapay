package dummy.instapay;

import java.util.Scanner;

public class Authentication {
    UserDB userDB = new UserDB();


    private User findUserByUsername(String username) {
        for (User user : userDB.getUsersList()) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null; // User not found (this should not happen if credentials were validated)
    }

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


}
