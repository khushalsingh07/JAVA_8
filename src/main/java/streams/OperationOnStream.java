package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OperationOnStream {
    public static void main(String[] args) {
        List<String> listOfName = new ArrayList<>();
        listOfName.add("Khushal");
        listOfName.add("Priyanka");
        listOfName.add("Shivika");
        listOfName.add("Prisha");
        listOfName.add("Prisha");
        listOfName.add("Dev");

        // Filter data on the basis of length
        //listOfName.stream().filter((String name)-> name.length()>3).forEach(System.out::println);
        System.out.println();
        System.out.println("************************");
        System.out.println();

        // get the distinct data
        //listOfName.stream().distinct().forEach(System.out::println);

        //limit() : Selects first n elements
        //listOfName.stream().limit(3).forEach(System.out::println);

        //skip() : Skips first n elements
        //listOfName.stream().skip(2).forEach(System.out::println);

        // Checking map() intermediate function
        //listOfName.stream().map(String::length).forEach(System.out::println);

        // List sorted in Natural Order
        //listOfName.stream().sorted().forEach(System.out::println);

        //Sorted the name list according to their length (Customized sorting)== Assending Order
        //listOfName.stream().sorted((String name1, String name2)-> name1.length()-name2.length()).forEach(System.out::println);

        //Sorted the name list according to their length (Customized sorting)== Ascending Order
        //listOfName.stream().sorted((String name1, String name2)-> name1.length()-name2.length()).forEach(System.out::println);

        //Sorted the name list according to their length (Customized sorting)== Decending Order
        //listOfName.stream().sorted((String name1, String name2)-> name2.length()-name1.length()).forEach(System.out::println);

        // use of collect(): It returns list of data
        //List<String> selectedNameList = listOfName.stream().limit(3).collect(Collectors.toList());
        //System.out.println(selectedNameList);

        //Performs an additional action on each element of a stream. This method is only
        // to support debugging where you want to see the elements as you pass in a pipeline.
        listOfName.stream()
                .filter(name -> name.length() > 5)
                .peek(e -> System.out.println("Filtered Name :"+e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped Name :"+e))
                .toArray();


    }
}
