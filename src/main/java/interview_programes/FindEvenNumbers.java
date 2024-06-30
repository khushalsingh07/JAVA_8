package interview_programes;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumbers {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10,23,24,76,98);
        integerList.stream().filter(n -> n%2==0).forEach(System.out::println);
    }
}
