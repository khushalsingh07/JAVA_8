package coding_questions;

import java.util.stream.IntStream;

public class TablesInMath {
    public static void main(String[] args) {
        generateTable(12);
    }

    static void generateTable(int tableNo){
        IntStream.rangeClosed(1,10).map(i->i*tableNo).forEach(System.out::println);
    }
}
