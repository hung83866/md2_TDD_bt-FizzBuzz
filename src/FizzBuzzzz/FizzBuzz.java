package FizzBuzzzz;

public class FizzBuzz {
    public static String fizz3Buzz5(int a){
        boolean isDivisible3 = a % 3 == 0;
        boolean isDivisible5 = a % 5 == 0;
        if (isDivisible3){
            if (isDivisible5){
                return "FizzBuss";
            }else return "Fizz";
        }else {
            if (isDivisible5){
                return "Buzz";
            }
        }
        return ""+ a ;
    }
}
