import java.util.ArrayList;
import java.util.List;

public class UserDB {
    User i;
    User j;
    public List<User> users;

    public UserDB() {
        users = new ArrayList<>();
        i = new User();
        j = new User();

        users.add(i);
        users.add(j);
    }

}
