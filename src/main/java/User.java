import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    List<User> friends = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void addFriend(User user) {
        friends.add(user);
        user.friends.add(this);
    }

    public List<User> getFriends() {
        return friends;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
