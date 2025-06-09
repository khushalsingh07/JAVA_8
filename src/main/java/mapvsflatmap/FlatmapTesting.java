package mapvsflatmap;

import pojo.Institute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatmapTesting {
    public static void main(String[] args) {
        List<Institute> instituteList = new ArrayList<>();

        instituteList.add(new Institute("IIM", Arrays.asList("Bangalore", "Ahmedabad", "Kozhikode", "Lucknow")));
        instituteList.add(new Institute("IIT", Arrays.asList("Delhi", "Mumbai", "Kharagpur")));
        instituteList.add(new Institute("NIFT", Arrays.asList("Hyderabad", "Mumbai", "Patna", "Bangalore")));
        instituteList.add(new Institute("IIM", Arrays.asList("Indore", "Patna", "Chnadigarh", "Hyderabad")));

       /* List<String> instituteNameList = instituteList.stream().map(institute -> institute.getName()).collect(Collectors.toList());
        System.out.println("instituteNameList   ::: "+instituteNameList);
        //Output: instituteNameList   ::: [IIM, IIT, NIFT]
        Set<String> instituteLocationSet = instituteList.stream().flatMap(institute -> institute.getLocations().stream()).collect(Collectors.toSet());
        System.out.println("instituteLocationSet  :: "+instituteLocationSet);
        //Output: instituteLocationSet  :: [Ahmedabad, Lucknow, Delhi, Patna, Kozhikode, Kharagpur, Mumbai, Hyderabad, Bangalore]
   */

        //map(0 & flatMap() testing with duplicate data
        // Institute list
        /*List<String> instituteNameList = instituteList.stream().map(institute -> institute.getName()).distinct().collect(Collectors.toList());
        instituteNameList.forEach(System.out::println);*/
        // Locations List
        /*List<String> locationList = instituteList.stream().flatMap(institute -> institute.getLocations().stream()).distinct().sorted().collect(Collectors.toList());
        locationList.forEach(System.out::println);*/
    }
}
