public interface Measurable<T>
{
    //declare the method getMeasure()
    public double getMeasure();
    //define the method largest()
    public static <T extends Measurable<T>> T largest(ArrayList<T> objects)
    {
//if the size of object is equal to size
        if (objects.size() == 0)
        {
//return null
            return null;
        }
//define a variable largest and set the first element of objects to it
        T largest = objects.get(0);
//iterarate a for loop
        for (T obj : objects)
        {
//if the condition is true
            if (obj.getMeasure() > largest.getMeasure())
            {
//set largest equal to obj
                largest = obj;
            }
        }
//return the value of largest
        return largest;
    }
}
Filename: “BankAccount.java”
//define the class BankAccount
public class BankAccount implements Measurable<BankAccount>
{
    //define the class member balance
    private double balance;
    //define the consrtructor BankAccount
    public BankAccount(double initial)
    {
//set the value of balance
        balance = initial;
    }
    //define a method deposit()
    public void deposit(double amt)
    {
//set the balance
        balance += amt;
    }
    //define the method withdraw()
    public void withdraw(double amt)
    {
//set the balance
        balance -= amt;
    }
    //define the method getBalance()
    public double getBalance()
    {
//return the value of balance
        return balance;
    }
    //define the method getMeasure()
    public double getMeasure()
    {
//return the value of balance
        return balance;
    }
}
Filename: “Country.java”
//define the class Country
public class Country implements Measurable<Country>
{
    //define the class members
    private String name;
    private double area;
    //define the constructor Country
    public Country(String aName, double anArea)
    {
//set the value of class members
        name = aName;
        area = anArea;
    }
    //define a method getName()
    public String getName()
    {
//return the name
        return name;
    }
    //define a method getArea()
    public double getArea()
    {
//return the area
        return area;
    }
    //define a method getMeasure()
    public double getMeasure()
    {
//return area
        return area;
    }
}
Filename: “MeasurableTester.java”
        //import the required packages
        import java.util.ArrayList;
//define a class MeasurableTester
public class MeasurableTester
{
    //define main method
    public static void main(String[] args)
    {
//create an array list accounts
        ArrayList<BankAccount> accounts = new ArrayList<>();
//add elements to accounts
        accounts.add(new BankAccount(0));
        accounts.add(new BankAccount(10000));
        accounts.add(new BankAccount(2000));
//create the variable of BankAccount
        BankAccount largestAccount = Measurable.largest(accounts);
//print the largest balance
        System.out.println("Largest balance is : " + largestAccount.getBalance());
//print the expected value
        System.out.println("Expected: 10000");
//create an array list countries
        ArrayList<Country> countries = new ArrayList<>();
//add elements to contries
        countries.add(new Country("Uruguay", 176220));
        countries.add(new Country("Thailand", 513120));
        countries.add(new Country("Belgium", 30510));
//create the variable of Country
        Country largestCountry = Measurable.largest(countries);
//print the largest area
        System.out.println("Largest area: " + largestCountry.getArea());
//print the expected value
        System.out.println("Expected: 513120");
//print the country name
        System.out.println("Country name: " + largestCountry.getName());
//print the expected value
        System.out.println("Expected: Thailand");
    }
}