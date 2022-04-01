import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void testAddFriend(){
        User user1 = new User("John");
        User user2 = new User("Jane");
        user1.addFriend(user2);
        assertEquals(1, user1.getFriends().size());
    }

    @Test
    public void testAddFriendTwice(){
        User user1 = new User("John");
        User user2 = new User("Jane");
        user1.addFriend(user2);
        user1.addFriend(user2);
        assertEquals(1, user1.getFriends().size());
    }

    @Test
    public void testUserAddsHimselfAsFriend(){
        User user1 = new User("John");
        user1.addFriend(user1);
        assertEquals(0, user1.getFriends().size());
    }
}
