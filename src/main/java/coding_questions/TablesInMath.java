package coding_questions;

import java.util.stream.IntStream;

public class TablesInMath {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,10).map(i->i*4).forEach(System.out::println);
    }
}
