import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SocialNetwork {
    private List<User> users = new ArrayList<>();


    // function that computes the shortest path between two users using bfs algorithm
    public List<User> shortestPath(User start, User destination) {
        List<User> shortestPath = new ArrayList<>();
        List<User> queue = new ArrayList<>();
        Map<User, User> previous = new java.util.HashMap<>();
        List<User> visited = new ArrayList<>();
        queue.add(start);
        visited.add(start);
        while (!queue.isEmpty()) {
            User current = queue.remove(0);
            if (current.equals(destination)) {
                break;
            }
            //go through all the friends of the current user and add them to the queue if they are not visited
            for (User friend : current.getFriends()) {
                if (!visited.contains(friend)) {
                    queue.add(friend);
                    visited.add(friend);
                    previous.put(friend, current);
                }
            }
        }

        //couldn't find the path to the target node
        if(!previous.containsKey(destination)) {
            return null;
        }

        //build the path from the destination to the start
        User current = destination;
        while (current != null) {
            shortestPath.add(current);
            current = previous.get(current);

        }
        return shortestPath;
    }

    public void addUser(User user) {
        if (!users.contains(user)) {
            users.add(user);
        }
    }

    public List<User> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "SocialNetwork{" +
                "users=" + users +
                '}';
    }
}
