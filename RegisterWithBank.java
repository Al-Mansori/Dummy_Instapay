package dummy.instapay;

public class RegisterWithBank extends Register{
    private BankAPI bankAPI;

    public RegisterWithBank(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    @Override
    protected User doRegister(String username, String password, String bankNumber) {
        if (bankAPI.isFoundBankID(bankNumber)){
            BankAccount bankAccount = new BankAccount();

            User newUser = new User(username, password, bankNumber, AccountType.bankAccount, bankAccount);
            UserDB.add(newUser);
            return newUser;
        } else {
            System.out.println("Registration failed. Invalid or duplicate input.");

        }
        return null;
    }

    @Override
    protected boolean isValidInput() {
        return true;
    }
}
