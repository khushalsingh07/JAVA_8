package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTraverssingissue {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Khushal","Priyanka","Khushi","Prisha");
        Stream<String> stream = nameList.stream();
        stream.forEach(System.out::println);
        stream.forEach(System.out::println); // During runtime we will get the issue error because we already
                                            // traversed the stream so we can traverse the stream again
    }
}
