package functionalinterfacetesting;

import pojo.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StudentTest {

    public static void main(String[] args) {
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


        /*Predicate represents an operation which takes an argument T and returns
        a boolean. Use this functional interface, if you want to define a
        lambda expression which performs some test on an argument and
        returns true or false depending upon outcome of the test.*/

        /* Predicate functional interface functionality testing
         Ex: list of Mathematics students from the above listOfStudents.*/
        // prdicateFunctionTesting(listOfStudents);

        // Consumer functional interface functionality testing
        // Consumer represents an operation which takes an argument and returns nothing.
        // Use this functional interface If you want to compose a lambda expression which performs some operations on an object.
        // Displaying all students with their percentage
        // consumerFunctionTesting(listOfStudents);

        // Function functional interface functionality testing
        // Function represents an operation which takes an argument of type T and returns a result of type R.
        // Use this functional interface if you want to extract some data from an existing data.
        // Extracting only the names from listOfStudents.
        //functionalInterfaceTesting(listOfStudents);

        //Supplier functional interface functionality testing
        //Supplier represents an operation which takes no argument and returns the results of type R.
        // Use this functional interface when you want to create new objects.
        // Lambda expression implementing Supplier : Creating a new Student
        supplierInterfaceTesting(listOfStudents);
    }

    public static void prdicateFunctionTesting(List<Student> listOfStudents){
        Predicate<Student> mathematicsPredicate =  (Student student) -> student.getSpecialization().equalsIgnoreCase("Mathematics");
        List<Student> listOfMathStudents = new ArrayList<Student>();

        for (Student student: listOfStudents){
            if(mathematicsPredicate.test(student)){
                listOfMathStudents.add(student);
            }
        }

        System.out.println("listOfMathStudents ::Size::"+listOfMathStudents.size());
        listOfMathStudents.forEach(student -> System.out.println(""+student.getName()));
    }


    public static void consumerFunctionTesting(List<Student> listOfStudents){
      Consumer<Student> percentageConsumer = (Student student)-> System.out.println(student.getName()+" having percentage  :: "+student.getPercentage());
        for (Student student : listOfStudents) {
            percentageConsumer.accept(student);
        }
    }

    public static void functionalInterfaceTesting(List<Student> listOfStudents){
    List<String> studentsNameList = new ArrayList<>();
        Function<Student, String> functionObj = (Student student)-> student.getName();
        for (Student student : listOfStudents) {
            studentsNameList.add(functionObj.apply(student));
        }
        studentsNameList.forEach(String -> System.out.println(String));
    }

    public  static void supplierInterfaceTesting(List<Student> listOfStudents){
        Supplier<Student> studentSupplier = ()-> new Student(111111, "New Student", 92.9, "Java 8");
        listOfStudents.add(studentSupplier.get());
        listOfStudents.forEach(student -> System.out.println(student.toString()));
    }

}
