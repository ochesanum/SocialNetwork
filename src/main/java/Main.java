public class Main {
    public static void main(String[] args) {
        User user1 = new User("John");
        User user2 = new User("Andrew");
        User user3 = new User("Jake");
        User user4 = new User("George");
        User user5 = new User("Popescu");
        User user6 = new User("Mihnea");
        User user7 = new User("Andreea");

        user1.addFriend(user2);
        user1.addFriend(user3);
        user2.addFriend(user3);
        user2.addFriend(user4);
        user3.addFriend(user5);
        user4.addFriend(user5);
        user5.addFriend(user6);
        user6.addFriend(user7);

        SocialNetwork socialNetwork = new SocialNetwork();
        socialNetwork.addUser(user1);
        socialNetwork.addUser(user2);
        socialNetwork.addUser(user3);
        socialNetwork.addUser(user4);
        socialNetwork.addUser(user5);
        socialNetwork.addUser(user6);

        System.out.println(socialNetwork);
        System.out.println(socialNetwork.shortestPath(user1, user7));
    }
}
