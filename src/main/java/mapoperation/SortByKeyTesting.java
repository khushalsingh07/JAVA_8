package mapoperation;

import java.util.*;
import java.util.stream.Collectors;

public class SortByKeyTesting {
    public static void main(String[] args) {
        Map<String, Integer> studentRecord = new HashMap<>();
        studentRecord.put("Khushal",1009);
        studentRecord.put("Priyanka",1001);
        studentRecord.put("Budhaa",1003);
        studentRecord.put("Kaushal",1001);

        // Sort map in ascending order using keys
        LinkedHashMap<String, Integer> sortedByKey = studentRecord.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (s1, s2) -> s2, LinkedHashMap::new));
        System.out.println("Sorted By Keys in Natural order  :: "+sortedByKey);

        System.out.println();
        System.out.println("*****************************");
        System.out.println();

        // Sort Map using keys in reverse order (By using Collections class method)
        LinkedHashMap<String, Integer> reversedMap1 = studentRecord.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (s1, s2) -> s2, LinkedHashMap::new));
        System.out.println("Sorted By Keys in reverse order 1 :: "+reversedMap1);

        System.out.println();
        System.out.println("*****************************");
        System.out.println();

        // Sort Map using keys in reverse order (By using Comparator Reverse method)
        LinkedHashMap<String, Integer> reversedMap2 = studentRecord.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (s1, s2) -> s2, LinkedHashMap::new));
        System.out.println("Sorted By Keys in reverse order 2 :: "+reversedMap2);

        System.out.println();
        System.out.println("*****************************");
        System.out.println();

        // Java 8 sort HashMap by keys using customized Comparator :
        // The below program uses Java 8 comparingByKey() method with customized Comparator
        // to sort HashMap in increasing order of length of keys.

        LinkedHashMap<String, Integer> customizedSortedHashMap = studentRecord.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey((o1, o2) -> o1.length() - o2.length()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (s1, s2) -> s2, LinkedHashMap::new));
        System.out.println("customizedSortedHashMap  ::: "+customizedSortedHashMap);
    }

}
