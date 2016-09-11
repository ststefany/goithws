/*You need to following structure: abstarct class Bank and three classes that extends it:
USBank, EUBank, ChinaBank. Enum Currency. Class User that represents User of our Bank System.
Interface BankSystem and its implementation BankSystemImpl.

Finally create Main class with main method, where you should create 6 Users: 2 of USBank,
2 of EUBank and 2 of ChinaBank. Run four different operations with erery User’s baalance and print its objects to console.

ЗАДАНИЕ 1

Abstract class Bank should contain fields

long id
String bankCountry
Currency currency
int numberOfEmployees
double avrSalaryOfEmployee
long rating
long totalCapital

Generate getters and setters. And create constructor with all fields.

Methods are:

abstract int getLimitOfWithdrawal()
abstract int getLimitOfFunding()
abstract int getMonthlyRate()
abstract int getCommission()
double moneyPaidMonthlyForSalary()

ЗАДАНИЕ 2

Currency is an Enum with two values: USD, EUR

ЗАДАНИЕ 3

USBank: limit of withdrawal = 1000 if currency is USD and 1200 if currency is EUR
limit of funding - 10000 if EUR and no limit if USD
monthly rate - 1% with USD and 1.5% with EUR
commision - 5% if USD and up to 1000, 7% if USD and more than 1000
6% if EUR and up to 1000 and 8% if EUR and more than 1000

EUBank: limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
limit of funding - 20000 if EUR and 10000 if USD
monthly rate - 0% with USD and 1% with EUR
commision - 5% if USD and up to 1000, 7% if USD and more than 1000
2% if EUR and up to 1000 and 4% if EUR and more than 1000

ChinaBank: limit of withdrawal = 100 if currency is USD and 150 if currency is EUR

limit of funding - 5000 if EUR and 10000 if USD
monthly rate - 1% with USD and 0% with EUR
commision - 3% if USD and up to 1000, 5% if USD and more than 1000
10% if EUR and up to 1000 and 11% if EUR and more than 1000

ЗАДАНИЕ 4

User should have following fields:

long id
String bankCountry
Currency currency
int numberOfEmployees
double avrSalaryOfEmployee
long rating
long totalCapital

User does not have its own methods. But overrides toString method.

ЗАДАНИЕ 5

Create interface BankSystem with methods:

void withdrawOfUser(User user, int amount)
void fundUser(User user, int amount)
void transferMoney(User fromUser, User toUser, int amount)

void paySalary(User user)

And its implementation

ЗАДАНИЕ 6

Сreate Main class with main method, where you should create 6 Users: 2 of USBank, 2 of EUBank and 2 of ChinaBank.
Run four different operations with every User’s balance and print its objects to console.
*/


public class Main  {

    public static void main(String[] args) {
        User user1 = new User(12,"EU", Currency.EUR, 54, 1000, 2345, 100000);
        User user2 = new User(178,"EU", Currency.USD, 55, 2000, 2345, 100000);
        User user3 = new User(3678,"US", Currency.EUR, 2, 6000, 2345, 100000);
        User user4 = new User(65,"US", Currency.USD, 7, 3000, 2345, 100000);
        User user5 = new User(89,"China", Currency.EUR, 7655, 1876, 2345, 100000);
        User user6 = new User(900,"China", Currency.USD, 6655, 1876, 2345, 100000);

        BankSystemImpl bankSystem = new BankSystemImpl();

        bankSystem.withdrawOfUser(user1, 1000);
        bankSystem.fundUser(user1, 5000);
        bankSystem.transferMoney(user1, user3, 4000);
        bankSystem.paySalary(user1);
        System.out.println();

        bankSystem.withdrawOfUser(user2, 100000);
        bankSystem.fundUser(user2, 5000);
        bankSystem.transferMoney(user2, user3, 400000);
        bankSystem.paySalary(user2);
        System.out.println();

        bankSystem.withdrawOfUser(user3, 1000);
        bankSystem.fundUser(user3, 5000);
        bankSystem.transferMoney(user3, user3, 40000);
        bankSystem.paySalary(user3);
        System.out.println();


        bankSystem.withdrawOfUser(user4, 1000);
        bankSystem.fundUser(user4, 5000);
        bankSystem.transferMoney(user4, user3, 2000);
        bankSystem.paySalary(user4);
        System.out.println();

        bankSystem.withdrawOfUser(user5, 100000);
        bankSystem.fundUser(user5, 5000);
        bankSystem.transferMoney(user5, user3, 2000);
        bankSystem.paySalary(user5);
        System.out.println();

        bankSystem.withdrawOfUser(user6, 1000);
        bankSystem.fundUser(user6, 5000);
        bankSystem.transferMoney(user6, user3, 778443);
        bankSystem.paySalary(user6);
        
    }

}
