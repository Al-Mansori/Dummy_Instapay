package dummy.instapay;

public class RegisterWithWallet extends Register{

    @Override
    protected User doRegister(String username, String password, String phoneNumber) {
        //انا عايزة اعمل والت بس مش منطقي ابعت البالانس بتاعي

        if (!UserDB.isFoundWallet(phoneNumber)) {
            Wallet wallet = new Wallet();
            User newUser = new User(username, password, phoneNumber, AccountType.wallet, wallet);
            UserDB.add(newUser);
            return newUser;
        } else {
            System.out.println("Wallet already registered. Registration aborted.");
        }
        return null;

    }

    @Override
    protected boolean isValidInput() {
        return true;
        //for now i will edit it
    }
}
