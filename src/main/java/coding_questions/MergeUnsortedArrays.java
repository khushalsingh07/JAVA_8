package coding_questions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeUnsortedArrays {
    public static void main(String[] args) {
        int[] a = new int[] {4, 2, 7, 1};
        int[] b = new int[] {8, 3, 9, 5, 1};

        // Duplicate data holding
        int[] mergedArray = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println("Merged Array  :: "+Arrays.toString(mergedArray));
        System.out.println("");
        //Remove duplicate data
        int[] mergedDistinctData = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println("mergedDistinctData  ::: "+Arrays.toString(mergedDistinctData));
    }
}
