public class Pair<T, S>
{
    //define the class members
    private T first;
    private S second;
    //constructor
    public Pair(T firstElement, S secondElement)
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