package coding_questions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachChacterInString {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";
        Map<Character, Long> charCountMap = inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Output  :: "+charCountMap);
        // Output  :: { =4, a=3, c=1, C=1, D=1, e=2, f=1, h=1, J=1, n=1, O=1, o=1, p=1, T=1, t=1, v=1, y=1}
    }
}
