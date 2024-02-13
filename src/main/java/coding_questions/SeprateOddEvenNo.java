package coding_questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SeprateOddEvenNo {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean, List<Integer>> partionedmapObj = listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        Set<Map.Entry<Boolean, List<Integer>>> entries = partionedmapObj.entrySet();

        entries.forEach(e->{
            if (e.getKey()){
                System.out.println("================Even No List==================");
                List<Integer> value = e.getValue();
                value.forEach(System.out::println);
            }else {
                System.out.println();
                System.out.println("================Odd No List====================");
                List<Integer> value = e.getValue();
                value.forEach(System.out::println);
            }
        });
    }
}
