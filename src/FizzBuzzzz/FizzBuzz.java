package FizzBuzzzz;

public class FizzBuzz {
    public static String fizz3Buzz5(int a){
        if (a%3==0){
            if (a%5==0){
                return "FizzBuss";
            }else return "Fizz";
        }else if (a%5==0){
            return "Buzz";
        }
        return ""+ a ;
    }
}
