import java.math.*;

public class PowerOfTwo {

    /*
    Реализуй метод isPowerOfTwo, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
     */
    public static boolean isPowerOfTwo(int value) {
        return (Integer.bitCount(Math.abs(value)) == 1 ? true : false);
    }

}
