/*USBank: limit of withdrawal = 1000 if currency is USD and 1200 if currency is EUR
limit of funding - 10000 if EUR and no limit if USD
monthly rate - 1% with USD and 1.5% with EUR
commision - 5% if USD and up to 1000, 7% if USD and more than 1000
6% if EUR and up to 1000 and 8% if EUR and more than 1000*/

public class USBank extends Bank {
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }



    @Override //limit of withdrawal = 1000 if currency is USD and 1200 if currency is EUR
    int getLimitOfWithdrawal() {
        if (this.currency.equals(Currency.USD))
            return 1000;
        else return 1200;
    }

    @Override //limit of funding - 10000 if EUR and no limit if USD
    int getLimitOfFunding() {
        if (this.currency.equals(Currency.USD))
            return Integer.MAX_VALUE;
        else return 10000;
    }

    @Override //1% with USD and 1.5% with EUR
    double getMonthlyRate() {
        if (this.currency.equals(Currency.USD))
            return 1;
        else return 1.5;
    }

    @Override //5% if USD and up to 1000, 7% if USD and more than 1000 if EUR and up to 1000 and 8% if EUR and more than 1000
    double getCommission(double sum) {
        if (this.currency.equals(Currency.USD))
            if (sum <=1000)
                return 0.05*sum;
            else return 0.07*sum;
        else
        if (sum<=1000)
            return 0.07*sum;
        else return 0.08*sum;
    }
}
