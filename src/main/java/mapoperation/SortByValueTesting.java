package mapoperation;

import java.util.*;
import java.util.stream.Collectors;

public class SortByValueTesting {
    public static void main(String[] args) {
        Map<Integer, String> studentRecord = new HashMap<>();
        studentRecord.put(1009, "Khushal");
        studentRecord.put(1005, "Priyanka");
        studentRecord.put(1003, "Budhaa");
        studentRecord.put(1001, "Kaushal");

        //Java 8 sorting using Entry.comparingByValue()
        LinkedHashMap<Integer, String> sortHashMapByValues = studentRecord.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (s1, s2) -> s2, LinkedHashMap::new));
        System.out.println("sortHashMapByValues  :: "+sortHashMapByValues);

        System.out.println();
        System.out.println("*****************************");
        System.out.println();


        //Sort Hash Map in reverse order by Collection.reverse()
        LinkedHashMap<Integer, String> reversedHashMapByCollections = studentRecord.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (s1, s2) -> s2, LinkedHashMap::new));
        System.out.println("reversedhashMapByCollections  :: "+reversedHashMapByCollections);

        System.out.println();
        System.out.println("*****************************");
        System.out.println();

        //Sort Hash Map in reverse order by using Comparator
        LinkedHashMap<Integer, String> reversedHashMapByComparator = studentRecord.entrySet()
                .stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (s1, s2) -> s2, LinkedHashMap::new));
        System.out.println("reversedHashMapByComparator  :: "+reversedHashMapByComparator);

        System.out.println();
        System.out.println("*****************************");
        System.out.println();

        LinkedHashMap<Integer, String> customizedSortingByValues = studentRecord.entrySet()
                .stream().sorted(Map.Entry.comparingByValue((o1, o2) -> o1.length() - o2.length()))
                //(Descending Order).stream().sorted(Map.Entry.comparingByValue((o1, o2) -> o2.length() - o1.length()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (s1, s2) -> s2, LinkedHashMap::new));
        System.out.println("customizedSortingByValues  :: "+customizedSortingByValues);

    }
}
