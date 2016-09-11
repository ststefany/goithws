/*EUBank: limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
limit of funding - 20000 if EUR and 10000 if USD
monthly rate - 0% with USD and 1% with EUR
commision - 5% if USD and up to 1000, 7% if USD and more than 1000
2% if EUR and up to 1000 and 4% if EUR and more than 1000*/

public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override //limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
    int getLimitOfWithdrawal() {
        if (this.currency.equals(Currency.USD))
            return 2000;
        else return 2200;
    }

    @Override //limit of funding - 20000 if EUR and 10000 if USD
    int getLimitOfFunding() {
        if (this.currency.equals(Currency.USD))
            return 10000;
        else return 20000;
    }

    @Override //monthly rate - 0% with USD and 1% with EUR
    double getMonthlyRate() {
        if (this.currency.equals(Currency.USD))
            return 0;
        else return 1;
    }

    @Override //commision - 5% if USD and up to 1000, 7% if USD and more than 1000 2% if EUR and up to 1000 and 4% if EUR and more than 1000
    double getCommission(double sum) {
        if (this.currency.equals(Currency.USD))
            if (sum <=1000)
                return 0.05 * sum;
            else return 0.07 * sum;
        else
            if (sum<=1000)
                return 0.02*sum;
            else return 0.04*sum;
    }

}
