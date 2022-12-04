//define a class BaknAccount
public class BankAccount implements Comparable<BankAccount> {
    //define the class member balance
    private double balance;

    //define the consrtructor BankAccount
    public BankAccount() {
//set the value of balance
        balance = 0;
    }

    //define the consrtructor BankAccount
    public BankAccount(double initialBalance) {
//set the value of balance
        balance = initialBalance;
    }

    //define a method deposit()
    public void deposit(double amount) {
//set the newBalance
        double newBalance = balance + amount;
//set balance equal to newBalance
        balance = newBalance;
    }

    //define the method withdraw()
    public void withdraw(double amount) {
//set the newBalance
        double newBalance = balance - amount;
//set balance equal to newBalance
        balance = newBalance;
    }

    //define the method getBalance()
    public double getBalance() {
//return the value of balance
        return balance;
    }

    //define the method compareTo()
    public int compareTo(BankAccount other) {
//calculate d
        double d = balance - other.balance;
//if d is less than 0
        if (d < 0)
//return -1
            return -1;
//if d greater than o
        if (d > 0)
//return 1
            return 1;
//return 0
        return 0;
    }
}
