/*ChinaBank: limit of withdrawal = 100 if currency is USD and 150 if currency is EUR

limit of funding - 5000 if EUR and 10000 if USD
monthly rate - 1% with USD and 0% with EUR
commision - 3% if USD and up to 1000, 5% if USD and more than 1000
10% if EUR and up to 1000 and 11% if EUR and more than 1000
*/

public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }


    @Override //limit of withdrawal = 100 if currency is USD and 150 if currency is EUR
    int getLimitOfWithdrawal() {
        if (this.currency.equals(Currency.USD))
            return 100;
        else return 150;
    }

    @Override //limit of funding - 5000 if EUR and 10000 if USD
    int getLimitOfFunding() {
        if (this.currency.equals(Currency.USD))
            return 10000;
        else return 5000;
    }

    @Override //1% with USD and 0% with EUR
    double getMonthlyRate() {
        if (this.currency.equals(Currency.USD))
            return 1;
        else return 0;
    }

    @Override //3% if USD and up to 1000, 5% if USD and more than 1000 10% if EUR and up to 1000 and 11% if EUR and more than 1000
    double getCommission(double sum) {
        if (this.currency.equals(Currency.USD))
            if (sum <=1000)
                return 0.03*sum;
            else return 0.05*sum;
        else
        if (sum<=1000)
            return 0.1 * sum;
        else return 0.11 * sum;
    }

}
