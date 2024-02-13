package methodreference;

import java.util.function.Function;

public class MethodReferenceToInstanceMethod {
    public static void main(String[] args) {
        Function<String, String> stringStringlambdaFunction = (String s) -> s.toLowerCase();
        System.out.println(""+stringStringlambdaFunction.apply("KHUSHAL"));

        Function<String, String> stringStringlambdaFunction2 = String::toLowerCase;
        System.out.println(""+stringStringlambdaFunction2.apply("PRIYANKA"));
    }
}
