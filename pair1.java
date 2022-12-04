public class pair1<T, S>
{
    //define the class members
    private T first;
    private S second;
    //constructor
    public pair1(T firstElement, S secondElement)
    {
//set class elements
        first = firstElement;
        second = secondElement;
    }
    //getter for first
    public T getFirst()
    {
//return the value
        return first;
    }
    //getter for second
    public S getSecond()
    {
//return the second
        return second;
    }
}

//define a class PairUtil
public class PairUtil
{
    //define the method minmax()
    public static <E extends Comparable<? super E>> Pair<E, E> minmax(E[] a)
    {
//if length of a is zero
        if (a.length == 0)
//return null
            return null;
//declare a variable min and set first element of a to it
        E min = a[0];
//declare a variable max and set first element of a to it


        E max = a[0];
//iterate a for loop
        for (E element : a)
        {
//if element is less than min
            if (element.compareTo(min) < 0)
//set min equal to element
                min = element;
//if element is greater than max
            if (element.compareTo(max) > 0)
//set max equal to element
                max = element;
        }
//create new pair and return it
        return new Pair<E, E>(min, max);
    }
}
Filename: “BankAccount.java”
//define a class BaknAccount
public class BankAccount implements Comparable<BankAccount>
{
    //define the class member balance
    private double balance;
    //define the consrtructor BankAccount
    public BankAccount()
    {
//set the value of balance
        balance = 0;
    }
    //define the consrtructor BankAccount
    public BankAccount(double initialBalance)
    {
//set the value of balance
        balance = initialBalance;
    }
    //define a method deposit()
    public void deposit(double amount)
    {
//set the newBalance
        double newBalance = balance + amount;
//set balance equal to newBalance
        balance = newBalance;
    }
    //define the method withdraw()
    public void withdraw(double amount)
    {
//set the newBalance
        double newBalance = balance - amount;
//set balance equal to newBalance
        balance = newBalance;
    }
    //define the method getBalance()
    public double getBalance()
    {
//return the value of balance
        return balance;
    }
    //define the method compareTo()
    public int compareTo(BankAccount other)
    {
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
Filename: “SavingsAccount.java”
//define a class SavingsAccount by extending BankAccount
public class SavingsAccount extends BankAccount
{
    //declare a variable interestRate
    private double interestRate;
    //define constructor SavingsAccount()
    public SavingsAccount(double rate)
    {
//set the value of interestRate
        interestRate = rate;
    }
    //set the method addInterest()
    public void addInterest()
    {
//calculate the interest
        double interest = getBalance() * interestRate / 100;
//call the method deposit()
        deposit(interest);
    }
}
Filename: “MinMaxTester.java”
//define new class MinMaxTester
public class MinMaxTester
{
    //define main method
    public static void main(String[] args)
    {
//define a object array accounts
        SavingsAccount[] accounts =
                {
//add values to array
                        new SavingsAccount(10),
                        new SavingsAccount(10),
                        new SavingsAccount(5),
                };
//call the method deposit to add elements to account
        accounts[0].deposit(1000);
        accounts[1].deposit(10000);
        accounts[2].deposit(10000);
//iterate a for loop
        for (SavingsAccount a : accounts)
//call addInterest on a
            a.addInterest();
//define a pair mm
        Pair<SavingsAccount, SavingsAccount> mm
                = PairUtil.minmax(accounts);
//get the first element of the pair
        System.out.println(mm.getFirst().getBalance());
//print the expected result
        System.out.println("Expected: 1100");
//print the second element of the pair
        System.out.println(mm.getSecond().getBalance());
//print the expected result
        System.out.println("Expected: 11000");
    }
}
