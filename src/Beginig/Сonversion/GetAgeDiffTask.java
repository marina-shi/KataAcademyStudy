package Beginig.Сonversion;

import java.math.*;

public class GetAgeDiffTask {

    /*
    Реализовать метод, который будет принимать два числа, выражающие возраст людей, и возвращать разницу в возрасте.
     */

    public static byte getAgeDiff(byte age1, byte age2) {
        int dif = age1 - age2;
        return (byte) Math.abs(dif);
    }
}
