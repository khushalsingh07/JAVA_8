package coding_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxMinFromIntegerList {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(45,12,56,15,24,75,31,89);
        Integer maxVal = intList.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Max Value  :: "+maxVal);

        Integer minVal = intList.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Min Value  :: "+minVal);
    }
}
