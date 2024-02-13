package streams;

import java.util.Arrays;
import java.util.OptionalInt;

public class ReducingOperationOnStream {
    public static void main(String[] args) {
        int[] intArray = {7, 5, 9, 2, 8, 1};

        //This method performs reduction operation on elements of a stream using initial value and binary operation.
        //int sum = Arrays.stream(intArray).sum();
        //System.out.println("Sum Value  : "+sum);

        // Reduce Function Testing
        int reduce = Arrays.stream(intArray).reduce(0, (a, b) -> a + b);
        System.out.println("Sum Value  : "+reduce);

        OptionalInt reduce1 = Arrays.stream(intArray).reduce((a, b) -> a + b);
        System.out.println("Reduce 1 Sum  : "+reduce1.getAsInt());

    }
}
