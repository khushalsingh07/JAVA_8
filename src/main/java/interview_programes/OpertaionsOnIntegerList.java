package interview_programes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OpertaionsOnIntegerList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        //Count of elements in list
        long noOfElements = integerList.stream().count();
        System.out.println("Count of Elements  :: "+noOfElements);

        System.out.println();

        //Get maximum value in the list
        Integer maxValue  = integerList.stream().max(Integer::compare).get();
        System.out.println("Maximum Value::  :: "+maxValue);
        System.out.println();

        //Sort Integer List
        integerList.stream().sorted().forEach(System.out::println);
        System.out.println();

        //Sort in reverse order
        integerList.stream()
                .sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
