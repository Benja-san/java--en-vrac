import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String args[]){
        
        // Stream API Demo
        List<Integer> numbersArray = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(numbersArray);
        // Imagine I want to double all the values
        // I can do it with an enhanced for loop
        for(int number : numbersArray){
            System.out.println(number * 2);
        }
        // you can do it with foreach
        // And you can prepare your action with a Consumer functional interface (that can be used with a lamba)
        // this FI has a method called accept that takes a parameter
        Consumer<Integer> action = number -> System.out.println(number * 2);
        numbersArray.forEach(action);
        // Simplier u can just pass action into forEach parameter without creating a Consumer but now you know how foreach works
        numbersArray.forEach(number -> System.out.println(number * 2));
        // Stream use
        // Stream is a sequence of elements from a source that supports aggregate operations on them
        // such as filter, map, reduce, find, match, and so on
        // Stream is an interface!
        // By using a stream we are going to make some actions on our numbers array WITHOUT affecting it but by duplicating it
        // Cause mutation of an array is sometimes (often) not good!
        Stream<Integer> streamNumbersArray1 = numbersArray.stream();
        // We can use the same action as before
        //streamNumbersArray1.forEach(number -> System.out.println(number * 2));
        // !!! Careful you can use the stream only once!
        // We can use stream methods to modulate or duplicated array
        // But first let's create a new stream cause we already used the first 1 // Or in this case we are going to use the first one to create the second one
        Stream<Integer> streamNumbersArray2 = streamNumbersArray1.filter(number -> number % 2 == 0);
        // We can use the same action as before
        //streamNumbersArray2.forEach(number -> System.out.println(number * 2));
        // now let's reduce the array
        Stream<Integer> streamNumbersArray3 = streamNumbersArray2.map(number -> number * 2);
        int result = streamNumbersArray3.reduce(0, (a, b) -> a + b);
        // We can use the same action as before
        System.out.println(result);
        // To make it quickier you can combine all methods!
        int result2 = numbersArray.stream().filter(number -> number % 2 == 0).map(number -> number * 2).reduce(0, (a, b) -> a + b);
        System.out.println(result2);

        // To go further about stream methods:
        //The filter method uses a Predicate functional interface to filter the stream
        //The map method uses a Function functional interface to map the stream
        //The reduce method uses a BiFunction functional interface to reduce the stream
        //The forEach method uses a Consumer functional interface to iterate over the stream
        // The stream methods are lazy, they are not executed until a terminal operation is invoked
        // Terminal operations are methods that return a result of a certain type instead of a stream
        // Such as forEach, reduce, collect, min, max, and so on
        // Intermediate operations are methods that return a stream instead of a result
        // Such as filter, map, limit, skip, and so on
        // for more information watch Telusko 99
        // With threads you can use parallelStream() instead of stream() to make the stream parallel
    }
}
