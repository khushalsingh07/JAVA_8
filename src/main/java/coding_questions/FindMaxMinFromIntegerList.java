package coding_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxMinFromIntegerList {
    public static void main(String[] args) {
        /*
            Steps:
            1. Convert List into Stream
            2. Apply max function with input parameter as sorted data (Comparator.naturalOrder())
            3. At last apply the get() function for picking the max value
        */

        List<Integer> intList = Arrays.asList(45,12,56,15,24,75,31,89);
        Integer maxVal = intList.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Max Value  :: "+maxVal);

        Integer minVal = intList.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Min Value  :: "+minVal);
    }
}
