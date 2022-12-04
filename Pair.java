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
Filename: “PairUtil.java”
Filename: “MinMaxTester.java”
//define the class MinMaxTester
public class MinMaxTester
{
    //define the main method
    public static void main(String[] args)
    {
//define the string array words
        String[] words =
                {
                        "Mary", "had", "a", "little", "lamb"
                };
//define a pair
        Pair<String, String> mm = PairUtil.minmax(words);
//get the first element of the pair
        System.out.println(mm.getFirst());
//print the expected result
        System.out.println("Expected: Mary");
//print the second element of the pair
        System.out.println(mm.getSecond());
//print the expected result
        System.out.println("Expected: little");
    }
}