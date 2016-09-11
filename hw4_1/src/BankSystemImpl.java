public class BankSystemImpl implements BankSystem {

    private static final Bank EU_BANK = new EUBank(1, "EU", Currency.EUR, 50, 1500, 3, 4567890);
    private static final Bank US_BANK = new USBank(45, "US", Currency.USD, 567, 2000, 2, 494476);
    private static final Bank CH_BANK = new ChinaBank(76, "China", Currency.USD, 1000, 50, 267887, 47654);

    private Bank getBankByCountry(User user) {
        switch (user.getBankCountry()) {
            case "EU": {
                EU_BANK.currency = user.getCurrency();
                return EU_BANK;
                }
            case "US": {
                US_BANK.currency = user.getCurrency();
                return US_BANK;
            }
            case "China": {
                CH_BANK.currency = user.getCurrency();
                return CH_BANK;
            }
            default:
                return null;
        }

    }

    @Override
    public void withdrawOfUser(User user, double amount) {
        Bank operationBank = getBankByCountry(user);
        double capital = user.getTotalCapital();
        int limit = operationBank.getLimitOfWithdrawal();
        if (amount > limit)
            System.out.println("Not possible: ask for less! Don't be so greedy");
        else {
            if (capital < amount + operationBank.getCommission(amount))
                System.out.println("C'mon, you don't have so much money, bro. You have only " + capital + operationBank.currency);
            else
                user.setTotalCapital(capital - amount);
                System.out.println("Thank you for the operation. You successfully withdrew " + amount + " " + operationBank.currency +". Comission was " + operationBank.getCommission(amount) + " " + operationBank.currency);
        }
    }

    @Override
    public void fundUser(User user, double amount) {
        Bank operationBank = getBankByCountry(user);
        double capital = user.getTotalCapital();
        int limit = operationBank.getLimitOfFunding();
        if (amount > limit)
            System.out.println ("Ok, we are happy that you want to give " + user + "so much money, but... No");
        else {
            user.setTotalCapital(capital + amount - operationBank.getCommission(amount));
            System.out.println(user + " was successfully funded. Total capital now is " + user.getTotalCapital());
        }


    }

    @Override
    public void transferMoney(User fromUser, User toUser, double amount) {
        Bank fromBank = getBankByCountry(fromUser);
        Bank toBank = getBankByCountry(toUser);
        double comission = 0;
        if (fromBank.currency != toBank.currency)
            System.out.println("Transaction is not possible. Choose different currency: " + toBank.currency);
        else {
            if (fromBank.equals(toBank))
                comission = fromBank.getCommission(amount);
            else comission = fromBank.getCommission(amount) + toBank.getCommission(amount);

            if (fromUser.getTotalCapital() < amount + comission)
                    System.out.println("You need your money by yourself! Don't be foolish!");
            else {
                fromUser.setTotalCapital(fromUser.getTotalCapital()-comission);
                toUser.setTotalCapital(toUser.getTotalCapital()+amount-comission);
                System.out.println("You successfully transferred " + amount + fromUser.getCurrency() +" to " + toUser + ". Comission was " + comission);
            }}
    }

    @Override
    public void paySalary(User user) {
        Bank operationbank = getBankByCountry(user);
        double salary = user.getAvrSalaryOfEmployee() * user.getNumberOfEmployees();
        if (user.getTotalCapital() < salary + operationbank.getCommission(salary))
            System.out.println("You don't have enough money to pay salary");
        else {
            user.setTotalCapital(user.getTotalCapital() - salary);
            System.out.println("You have successfully paid salaries to your employees");
        }
    }
}
