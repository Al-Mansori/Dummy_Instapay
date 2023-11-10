package dummy.instapay;

public abstract class Register {
    public User register(String username, String password, String phoneNumber) {
        if (isValidInput() && !UserDB.isUsernameExist(username)) {
            return doRegister(username, password, phoneNumber);
        } else {
            System.out.println("Registration failed. Invalid or duplicate input.");
            return null;
        }
    }

    protected abstract User doRegister(String username, String password, String phoneNumber);

    protected abstract boolean isValidInput();

}
