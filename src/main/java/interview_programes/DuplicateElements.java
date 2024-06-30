package interview_programes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(23,34,23,45,76,34,13,54,13);
        HashSet<Integer> hashSet = new HashSet<>();
        integerList.stream()
                .filter(n -> !hashSet.add(n)) //Add data when data is duplicate or already present in hash set
                .forEach(System.out::println);
    }
}
