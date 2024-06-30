package interview_programes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class VerifyTheListDataDuplicity {
    public static void main(String[] args) {
        int[] array1 = IntStream.of(12,25,36,12,28,96,47).toArray(); // Non Sorted Array
        int[] array2 = IntStream.of(12,25,36,85,28,96,47).sorted().toArray(); // Sorted Array


        List<Integer> collect = Arrays.stream(array1).boxed().collect(Collectors.toList());

        HashSet<Integer> hashSet = new HashSet<>(collect);

        if (hashSet.size() == collect.size())
            System.out.println("Array has duplicate data.....");
        else
            System.out.println("Array has duplicate data.....");


    }
}
