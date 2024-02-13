package streams;

import pojo.Student;

import java.util.stream.Stream;

public class StreamObjectsCreation {
    public static void main(String[] args) {
        Stream<Student> emptyStreamObj = Stream.empty();
        System.out.println("Count of Empty Stream Obj  :: "+emptyStreamObj.count());

        Stream<Student> singleStreamElement = Stream.of(new Student());
        System.out.println("singleStreamElement count   :::: "+singleStreamElement.count());

        Stream<Integer> streamOfInteger = Stream.of(2,3,4,5,6,7,8,1,9);
        System.out.println("streamOfInteger count   : "+streamOfInteger.count());
    }
}
