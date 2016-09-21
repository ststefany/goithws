public class Main {

    public static void main(String[] args) {
        User[] users = new User[5];

        users[0] = new User(123, "Kate", "Hudson", 500, 1345);
        users[1] = new User(124, "Merlin", "Crowly", 900, 1345);
        users[2] = new User(125, "Huston", "Johnson", 500, 234);
        users[3] = new User(125, "Huston", "Johnson", 500, 234);
        users[4] = null;

        users = UserUtils.deleteEmptyUsers(users);
        users = UserUtils.uniqueUsers(users);
        UserUtils.usersWithContitionalBalance(users, 500);
        UserUtils.paySalaryToUsers(users);
        UserUtils.getUsersId(users);

    }
}
