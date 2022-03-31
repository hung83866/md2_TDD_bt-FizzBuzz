package FizzBuzzzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    @DisplayName("case %3 %5 == 0")
    void Test() {
        int a = 15;
        String exp = "FizzBuss";
        String result = FizzBuzz.fizz3Buzz5(a);
        assertEquals(exp,result);
    }
}