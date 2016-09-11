
public class User {

    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    //    void paySalary() -  that add salary to the balance of the user

    public void paySalary() {
        this.balance = this.balance + this.salary;

    }

    //    withdraw(int sum) - takes money from the balance with 5% commission if sum < 1000 and 10% commision in other cases
    public void withdraw(int sum) {
        if (sum < 1000)
            this.balance = this.balance - sum - sum * 0.05;
        else
            this.balance = this.balance - sum - sum * 0.1;
    }

    //    monthIncrease(int addMonth) - increase monthsOfEmployment by addMonth
    public void monthIncrease(int addMonth) {
        this.monthsOfEmployment = this.monthsOfEmployment + addMonth;
    }

    //companyNameLength - calculates name of the company name

    public int companyNameLength() {
        return this.companyName.length();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
