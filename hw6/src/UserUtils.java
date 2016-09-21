import java.util.ArrayList;

public class UserUtils {

    static User[] uniqueUsers(User[] users) {
        ArrayList<User> equals = new ArrayList<>();
        User n = null;
        int d = 0;
        for (int i = 0; i < users.length; i++) {
            for (int a = 1; a < users.length; a++)
                if (!(users[i].equals(users[a])))
                    d++;
                else d = 0;
            if (d == users.length - i-1)
                equals.add(users[i]);
            else System.out.println(users[i] + " has been deleted");
        }
        return users = equals.toArray(new User[equals.size()]);
    }

    static User[] usersWithContitionalBalance(User[] users, int balance) {
        ArrayList<User> equals = new ArrayList<>();
        int a = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                equals.add(users[i]);
                System.out.print(users[i] + " ");
                a++;
            }
        }
        if (a == 0)
            System.out.println("No users with contitional balance");
        else System.out.println();
        return equals.toArray(new User[equals.size()]);
    }

    static final User[] paySalaryToUsers(User[] users) {
        for (int i = 0; i < users.length; i++)
            users[i].setBalance(users[i].getSalary() + users[i].getBalance());
        System.out.println("Balances are set");
        return users;
    }

    static final long[] getUsersId(User[] users) {
        long[] ids = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            ids[i] = users[i].getId();
            System.out.print(ids[i] + " ");
        }
        System.out.println();
        return ids;
    }

    static User[] deleteEmptyUsers(User[] users) {
        ArrayList<User> array = new ArrayList<>();
        for (int i = 0; i < users.length; i++)
            if (!(users[i] == null)) {
                array.add(users[i]);
                System.out.print(users[i]);
            }
        System.out.println();
        System.out.println("Empty users has been deleted");
        return array.toArray(new User[array.size()]);
    }

}
