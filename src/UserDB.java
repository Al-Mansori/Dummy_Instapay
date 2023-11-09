import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class UserDB {

    public List<User> users;

    public UserDB() {
        users = new ArrayList<>();

    }

    public List<User> getUserList() {
        return users;
    }

}
