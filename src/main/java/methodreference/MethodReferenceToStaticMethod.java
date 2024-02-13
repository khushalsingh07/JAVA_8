package methodreference;

import java.util.function.Function;

public class MethodReferenceToStaticMethod {
    public static void main(String[] args) {
        //Calling parseInt() method using lambda
        Function<String, Integer> stringIntegerLambdaFunction = (s) -> Integer.parseInt(s);
        System.out.println("String 12 converted into Integer   :: "+stringIntegerLambdaFunction.apply("12"));

        //Calling parseInt() method using method reference
        Function<String, Integer> stringIntegerMethodReference =Integer::parseInt;
        System.out.println("String 13 converted into Integer   :: "+stringIntegerLambdaFunction.apply("13"));


        changeString("15");
    }


    public static void changeString(String s){
        int x = Integer.parseInt(s);
        System.out.println("x  :: "+x);
    }
}
