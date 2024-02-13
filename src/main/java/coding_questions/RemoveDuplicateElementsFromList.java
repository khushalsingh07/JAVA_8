package coding_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsFromList {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> collect = listOfStrings.stream().distinct().collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
