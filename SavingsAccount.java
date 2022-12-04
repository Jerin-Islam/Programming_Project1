//define a class SavingsAccount by extending BankAccount
public class SavingsAccount extends BankAccount {
    //declare a variable interestRate
    private double interestRate;

    //define constructor SavingsAccount()
    public SavingsAccount(double rate) {
//set the value of interestRate
        interestRate = rate;
    }

    //set the method addInterest()
    public void addInterest() {
//calculate the interest
        double interest = getBalance() * interestRate / 100;
//call the method deposit()
        deposit(interest);
    }
}
