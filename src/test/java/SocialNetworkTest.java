import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SocialNetworkTest {
    private SocialNetwork socialNetwork;

    @Before
    public void setUp() {
        socialNetwork = new SocialNetwork();
    }

    @Test
    public void testAddUser() {
        User user = new User("John");
        socialNetwork.addUser(user);
        assertEquals(1, socialNetwork.getUsers().size());
    }

    @Test
    public void testAddUserTwice() {
        User user = new User("John");
        socialNetwork.addUser(user);
        socialNetwork.addUser(user);
        assertEquals(1, socialNetwork.getUsers().size());
    }

    @Test
    public void testShortestPathWithOneUser() {
        User user = new User("John");
        socialNetwork.addUser(user);
        assertNull(socialNetwork.shortestPath(user, user));
    }

    @Test
    public void testShortestPathWithNoPathToDestination(){
        User user1 = new User("John");
        User user2 = new User("Jane");
        User user3 = new User("Jack");
        user1.addFriend(user2);
        socialNetwork.addUser(user1);
        socialNetwork.addUser(user2);
        socialNetwork.addUser(user3);
        assertNull(socialNetwork.shortestPath(user1, user3));
    }

    @Test
    public void testShortestPathWithCyclicGraph(){
        User user1 = new User("John");
        User user2 = new User("Jane");
        User user3 = new User("Jack");
        User user4 = new User("Jill");
        user1.addFriend(user2);
        user2.addFriend(user3);
        user3.addFriend(user1);
        user3.addFriend(user4);
        socialNetwork.addUser(user1);
        socialNetwork.addUser(user2);
        socialNetwork.addUser(user3);
        socialNetwork.addUser(user4);
        assertEquals(2, socialNetwork.shortestPath(user1, user4).size()-1);
    }

}
