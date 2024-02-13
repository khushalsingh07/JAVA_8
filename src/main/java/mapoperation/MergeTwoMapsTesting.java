package mapoperation;

import java.util.HashMap;

public class MergeTwoMapsTesting {
    public static void main(String[] args) {
        //Map-1
        HashMap<String, Integer> subjectToStudentCountMap1 = new HashMap<>();
        subjectToStudentCountMap1.put("Maths",45);
        subjectToStudentCountMap1.put("Physics",57);
        subjectToStudentCountMap1.put("Chemistry",52);
        subjectToStudentCountMap1.put("History",41);

        //Map-2
        HashMap<String, Integer> subjectToStudentCountMap2 = new HashMap<>();
        subjectToStudentCountMap2.put("Economics",49);
        subjectToStudentCountMap2.put("Maths",42);
        subjectToStudentCountMap2.put("Biology",41);
        subjectToStudentCountMap2.put("History",55);

        //Merging Map-1 & Map-2 into Map-3
        HashMap<String, Integer> subjectToStudentCountMap3 = new HashMap<>(subjectToStudentCountMap1);
        subjectToStudentCountMap2.forEach((key, value)-> subjectToStudentCountMap3.merge(key, value, Integer::sum));
        System.out.println("subjectToStudentCountMap1  :: "+subjectToStudentCountMap1);
        System.out.println("********************************************************");
        System.out.println("subjectToStudentCountMap2   :: "+subjectToStudentCountMap2);
        System.out.println("********************************************************");
        System.out.println("subjectToStudentCountMap3   :: "+subjectToStudentCountMap3);


    }
}
