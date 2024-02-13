package collectors;

import pojo.Student;

import java.util.*;
import java.util.stream.Collectors;

public class OperationThroughCollectors {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9);

        /*collect() method is a terminal operation in Stream interface.
        It is a special case of reduction operation called mutable reduction
        operation because it returns mutable result container such as List,
        Set or Map according to supplied Collector.*/
        //collect() method returning List of OddNumbers
        //collect() method example
        //List<Integer> oddNoList = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        //System.out.println("Odd No List  ::: "+oddNoList);

        List<Student> listOfStudents = new ArrayList<Student>();

        listOfStudents.add(new Student(111, "John", 81.0, "Mathematics"));
        listOfStudents.add(new Student(222, "Harsha", 79.5, "History"));
        listOfStudents.add(new Student(333, "Ruth", 87.2, "Computers"));
        listOfStudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));
        listOfStudents.add(new Student(555, "Zade", 83.5, "Computers"));
        listOfStudents.add(new Student(666, "Xing", 58.5, "Geography"));
        listOfStudents.add(new Student(777, "Richards", 72.6, "Banking"));
        listOfStudents.add(new Student(888, "Sunil", 86.7, "History"));
        listOfStudents.add(new Student(999, "Jordan", 58.6, "Finance"));
        listOfStudents.add(new Student(101010, "Chris", 89.8, "Computers"));

        //Collectors.toList():
        //It returns a Collector which collects all input elements into a new List.
        //Example : Collecting top 3 performing students into List
        /*List<Student> topThreePercentageHolder = listOfStudents
                .stream()
                .sorted(Comparator.comparingDouble(Student::getPercentage).reversed())
                .limit(3)
                .collect(Collectors.toList());*/
        //System.out.println("topThreePercentageHolder  : "+topThreePercentageHolder);
        //Output: topThreePercentageHolder  : [Student{id=101010, name='Chris', percentage=89.8, specialization='Computers'}, Student{id=333, name='Ruth', percentage=87.2, specialization='Computers'}, Student{id=888, name='Sunil', percentage=86.7, specialization='History'}]
        //System.out.println();
        //Only name field for top three percentage gainers
        //topThreePercentageHolder.forEach((Student student)-> System.out.println(""+student.getName()));


        //Collectors.toSet():
        //It returns a Collector which collects all input elements into a new Set
        //Example : Collecting subjects offered into Set.
       /* Set<String> uniqueSubjectInSet = listOfStudents
                .stream()
                .map(Student::getSpecialization)
                .collect(Collectors.toSet());*/
        //System.out.println("uniqueSubjectInSet   ::: "+uniqueSubjectInSet);
        //Output: uniqueSubjectInSet   ::: [Computers, Geography, Finance, Banking, Mathematics, History]

        // 3.3) Collectors.toMap() :
        // This method returns a Collector which collects input elements into a Map
        // whose keys and values are the result of applying mapping functions to input elements.
        // Example : Collecting name and percentage of each student into a Map
        /*Map<Integer, String> studentRecordInMap = listOfStudents
                                                  .stream()
                                                  .collect(Collectors.toMap(Student::getId, Student::getName));
        */
        //System.out.println("studentRecordInMap  : "+studentRecordInMap);

        // 3.4) Collectors.toCollection() :
        // This method returns a Collector which collects all input elements into a new Collection.
        // Example : Collecting first 3 students into LinkedList

        /*LinkedList<Student> linkedListCollection = listOfStudents
                .stream()
                .limit(3)
                .collect(Collectors.toCollection(LinkedList::new));*/
        //System.out.println("linkedListCollection :: "+linkedListCollection);

        //3.5) Collectors.joining() :
        //This method returns a Collector which concatenates input elements separated by the specified delimiter.
        //Example : Collecting the names of all students joined as a string

        /*String joinedStr = listOfStudents
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("$"));*/
        //System.out.println("joinedStr  :: "+joinedStr);
        //Output: joinedStr  :: John$Harsha$Ruth$Aroma$Zade$Xing$Richards$Sunil$Jordan$Chris

        //3.6) Collectors.counting() :
        //It returns a Collector that counts number of input elements.
        //Example : Counting number of students.

        //Long countOfStudents = listOfStudents.stream().collect(Collectors.counting());
        //System.out.println("countOfStudents  :: "+countOfStudents);
        //Output: countOfStudents  :: 10

        //3.7) Collectors.maxBy() :
        //This method returns a Collector that collects largest element in a stream according to supplied Comparator.
        //Example : Collecting the highest percentage.
        //Optional<Double> maxByValue = listOfStudents.stream().map(Student::getPercentage).collect(Collectors.maxBy(Comparator.naturalOrder()));
        //System.out.println("maxByValue   :: "+maxByValue.get());

        //3.8) Collectors.minBy() :
        //This method returns a Collector which collects smallest element in a stream according to supplied Comparator.
        //Example : Collecting the lowest percentage.
        /*Optional<Double> minValue = listOfStudents
                .stream()
                .map(Student::getPercentage).collect(Collectors.minBy(Comparator.naturalOrder()));*/
        //System.out.println("minValue   :: "+minValue.get());

        //3.9) summingInt(), summingLong(), summingDouble()
        //These methods returns a Collector which collects sum of all input elements.
        //Example : Collecting sum of percentages
        /*Double sumOfPercentage = listOfStudents
                .stream()
                .collect((Collectors.summingDouble(Student::getPercentage)));*/
        //System.out.println("sumOfPercentage  : "+sumOfPercentage);

        //3.10) averagingInt(), averagingLong(), averagingDouble()
        //These methods return a Collector which collects average of input elements.
        // Example : Collecting average percentage
        Double avgOfPercentage = listOfStudents
                .stream()
                .collect(Collectors.averagingDouble(Student::getPercentage));
        System.out.println("avgOfPercentage  : "+avgOfPercentage);

        //3.11) summarizingInt(), summarizingLong(), summarizingDouble()
        //These methods return a special class called Int/Long/ DoubleSummaryStatistics
        // which contain statistical information like sum, max, min, average etc of input elements.
        //Example : Extracting highest, lowest and average of percentage of students
        /*DoubleSummaryStatistics summarizingStratistics = listOfStudents
                .stream()
                .collect(Collectors.summarizingDouble(Student::getPercentage));*/
        //System.out.println("Min Value : "+summarizingStratistics.getMin());
        //System.out.println("Max Value  : "+summarizingStratistics.getMax());
        //System.out.println("Average Value  : "+summarizingStratistics.getAverage());
        //System.out.println("Sum  : "+summarizingStratistics.getSum());
        //System.out.println("Count  : "+summarizingStratistics.getCount());

        //3.12) Collectors.groupingBy() :
        //This method groups the input elements according supplied classifier
        // and returns the results in a Map.
        //Example : Grouping the students by subject
        /*Map<String, List<Student>> studentDetailInGroup = listOfStudents
                .stream()
                .collect(Collectors.groupingBy(Student::getSpecialization));*/
        //System.out.println("studentDetailInGroup : "+studentDetailInGroup);

        //3.13) Collectors.partitioningBy() :
        // This method partitions the input elements according to supplied Predicate and returns
        // a Map<Boolean, List<T>>. Under the true key, you will find elements which match given
        // Predicate and under the false key, you will find the elements which doesn’t match given Predicate.
        //Example : Partitioning the students who got above 80.0% from who don’t.

       /* Map<Boolean, List<Student>> collectionAsPartition = listOfStudents
                .stream()
                .collect(Collectors.partitioningBy(student -> student.getPercentage() > 80.0));*/
        //System.out.println("collectionAsPartition  : "+collectionAsPartition);

        //3.14) Collectors.collectingAndThen() :
        //This is a special method which lets you to perform one more action on the result after collecting the result.
        //Example : Collecting first three students into List and making it unmodifiable

       /* List<Student> unmodifiedable = listOfStudents
                .stream()
                .limit(3)
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
        System.out.println("unmodifiedable  ::: "+unmodifiedable);*/
    }
}
