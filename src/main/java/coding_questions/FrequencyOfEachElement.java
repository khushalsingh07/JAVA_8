package coding_questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElement {
    public static void main(String[] args) {
        //Work done on list
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String, Long> collect1 = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("collect1   :: "+collect1);


        // Work done on Array
        String[] strArr = {"Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil"};
        Map<String, Long> collect2 = Arrays.stream(strArr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("collect2  ::: "+collect2);
    }
}
