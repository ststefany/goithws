package com.stefany.homework2;

/*You need to write method which will fund (пополнение) balance of particular user. Print name + balance after funding
 */
public class hw2_4 {
    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Oww";
        int addmoney = 100;
        fund (ownerName, addmoney, ownerNames, balances);

    }

    static void fund (String ownerName, int addmoney, String[] ownerNames, int[] balances ) {
        int a = 0;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i] == ownerName)
                a = i;
        };

        int bal = balances[a] + addmoney;
            System.out.println(ownerName + " " + bal);
    }
}
