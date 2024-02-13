package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamFromCollection {
    public static void main(String[] args) {
        List<String> listOfName = new ArrayList<>();
        listOfName.add("Khushal");
        listOfName.add("Priyanka");
        listOfName.add("Shivika");
        listOfName.add("Prisha");

        listOfName.stream().forEach(System.out::println);

    }
}
