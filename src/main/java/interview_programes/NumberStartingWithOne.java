package interview_programes;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(23,11,15,37,97,19,34,17);
        integerList.stream()
                .map(i -> i+"") //Converting Integer to String
                .filter(s ->s.startsWith("1"))
                .forEach(System.out::println);
    }
}
