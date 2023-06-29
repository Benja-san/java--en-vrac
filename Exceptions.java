import src.throwsMethods.UselessClass;
import src.exceptions.MyOwnException;

public class Exceptions {
    public static void main(String args[]){
        //Errors type demo
        //System.out.printLN("hello"); // Error: printLN is not a method of System.out: Compile Error
        System.out.println(2+"2"); // Error: 2 is an int, "2" is a String: 22 will be given: logical error
        // Runtime errors: ArithmeticException, ArrayIndexOutOfBoundsException, ClassCastException, IllegalArgumentException, NullPointerException, NumberFormatException, StackOverflowError, StringIndexOutOfBoundsException, UnsupportedOperationException, etc.
        //Handling multiple exceptions demo
        try
        {
            int divider = 2;
            int number = 10;
            int division = number / divider;
            System.out.println(division);
            int nums[] = new int[5];
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.getMessage() + " Something went wrong");
        }
        finally
        {
            System.out.println("Finally blocked");
        }
        // Throw keyword demo
        try
        {
            int divider = 0;
            int number = 10;
            if(divider == 0)
            {
                throw new MyOwnException("Divider cannot be 0");
            }
            int division = number / divider;
            System.out.println(division);
        }
        catch(MyOwnException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.getMessage() + " Something went wrong");
        }
        finally
        {
            System.out.println("Finally blocked");
        }
        //Throws keyword demo
        UselessClass uselessClass = new UselessClass();
        try
        {
            uselessClass.uselessMethod();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
