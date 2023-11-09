import jdk.internal.joptsimple.util.RegexMatcher;

public class Aoth {

    UserDB userDB;
    Api api;

    public Aoth() {
        userDB = new UserDB();
        api = new Api();
    }

    public User ver1(User u) {

        User i = new User();
        i = userDB.users[0];
        return u;
    }

    public boolean ver2(String phoneNumber) {
        return true;
    }

    public User regestur() {
        User s = new User();
        return s;
    }

    public User login() {
        User s = new User();
        return s;
    }

    public void sendOtp() {
        return;
    }

}
