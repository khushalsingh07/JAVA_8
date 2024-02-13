package coding_questions;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElements {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        Map<String, Long> collect =
                listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map.Entry<String, Long> mostRepetedEntry = collect.entrySet().stream().max(Map.Entry.comparingByValue()).get();

        System.out.println("Most repeated element "+mostRepetedEntry.getKey()+" having count : "+mostRepetedEntry.getValue());
    }
}
