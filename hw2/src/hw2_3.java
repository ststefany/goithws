/*You need to write method which withdraw money of particular account owner
        if he/she can. Print name + NO of withdrawal fs not possible and name
        + sum of withdrawal + balance after withdrawal in other case. Commission is 5% for all cases./
*/
public class hw2_3 {

    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Ann";
        double withdrawal = 100;
        partwithdraw(ownerName, withdrawal, ownerNames, balances);

        ownerName = "Oww";
        withdrawal = 490;
        partwithdraw(ownerName, withdrawal, ownerNames, balances);
    }

    static void partwithdraw (String ownerName, double withdrawal, String[] ownerNames, int[] balances ) {
        int a = 0;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i] == ownerName)
                a = i;
        };

        double bal = balances[a];
        double commission = 0.05 * withdrawal;
        bal = bal - withdrawal - commission;
        if (bal > 0)
            System.out.println(ownerName + " " + withdrawal + " " + bal);
        else
            System.out.println(ownerName + " NO");
    }
}
