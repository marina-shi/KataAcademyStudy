package Beginig.Сonversion;

import java.math.*;

public class BigIntegerTask {

    /*
    Реализовать метод, который выведет на экран квадрат максимального значения, которое может содержаться
    в переменной long. Чтобы это значение уместилось, необходимо использовать класс BigInteger
     */

    public static void maxLongSqr() {
        BigInteger maxLong = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger kvadrat = maxLong.multiply(maxLong);
        System.out.println(kvadrat);
    }

}
