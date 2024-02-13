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

        List<String> instituteNameList = instituteList.stream().map(institute -> institute.getName()).collect(Collectors.toList());
        System.out.println("instituteNameList   ::: "+instituteNameList);
        //Output: instituteNameList   ::: [IIM, IIT, NIFT]

        Set<String> instituteLocationSet = instituteList.stream().flatMap(institute -> institute.getLocations().stream()).collect(Collectors.toSet());
        System.out.println("instituteLocationSet  :: "+instituteLocationSet);
        //Output: instituteLocationSet  :: [Ahmedabad, Lucknow, Delhi, Patna, Kozhikode, Kharagpur, Mumbai, Hyderabad, Bangalore]
    }
}
