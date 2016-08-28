package com.stefany.homework2;

/**
 *ЗАДАНИЕ 2

 Continue with BANK example
 2.1 Write method which withdraw money from account and takes commision 5% of the transaction.
 Print OK + commision + balance after withdrawal. Print NO is withdrawal is not possible.

 Example

 Input

 balance = 100
 withdrawal = 10

 Output
 OK 0.5 89.5


 Input

 balance = 100
 withdrawal = 99

 Output
 NO


 */
public class hw2_2 {

    public static void main(String[] args) {
        withdraw(100, 10);
        withdraw(100, 99);
    }

    static void withdraw (double bal, double take) {
        double commission = 0.05 * take;
        bal = bal - take - commission;
        if (bal > 0)
            System.out.println("OK " + commission + " " + bal);
        else
            System.out.println("NO");
    }

}
