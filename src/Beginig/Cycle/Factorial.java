package Beginig.Cycle;
import java.math.BigInteger;

    /*
    Реализуйте метод factorial, вычисляющий факториал заданного натурального числа.
     */

public class Factorial {
    public static BigInteger factorial(int value) {
        /* if (value <= 1 ) { --- рекурсивное решение
            return BigInteger.valueOf(1);
        } else {
            BigInteger num = BigInteger.valueOf(value);
            return num.multiply(num.subtract(BigInteger.valueOf(1)));
            return num.multiply(factorial(value - 1));
        }  */

        BigInteger num = BigInteger.valueOf(1);
        for (int i = 1; i <= value; i++) {
            num = num.multiply(BigInteger.valueOf(i));
        }
        return num;
    }
}
