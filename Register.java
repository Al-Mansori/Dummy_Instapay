package dummy.instapay;

import java.util.Random;

public abstract class Register {
    public User register(String username, String password, String id,AccountType type) {
        // i think we should delete !
        if (!UserDB.isUsernameExist(username)) {
            return doRegister(username, password, id,type);
        } else {
            System.out.println("Registration failed. Invalid or duplicate input.");
            return null;
        }
    }
    protected double generateBalance(){
        Random random = new Random();
        return random.nextInt(1000) + 20;
    }

    protected abstract User doRegister(String username, String password, String phoneNumber,AccountType type);


}
