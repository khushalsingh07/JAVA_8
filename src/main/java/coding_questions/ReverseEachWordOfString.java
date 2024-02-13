package coding_questions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordOfString {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";
        String reversedStr = Arrays.stream(str.split(" "))
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println("Reversed String  :: "+reversedStr);
    }
}
