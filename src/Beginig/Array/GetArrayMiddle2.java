package Beginig.Array;

import java.util.Arrays;

/*
Дан массив произвольной длины. Необходимо вернуть центральную часть массива. Причем, если массив четной длины,
то вернуть массив из двух элементов, если нечетной, то вернуть массив из одного элемента.
Пример ввода: {1, 5, 2, 17}
Пример вывода: [5, 2]
 */
public class GetArrayMiddle2 {
    public static int[] getArrayMiddle(int[] numbers) {
        int[] newMassive;
        if (numbers.length % 2 == 0 && numbers.length != 0) {
            newMassive = Arrays.copyOfRange(numbers, numbers.length/2 - 1, numbers.length/2 + 1);
        } else if (numbers.length == 0) {
            newMassive = new int[]{};
        } else {
            newMassive = Arrays.copyOfRange(numbers, numbers.length/2, numbers.length/2 + 1);
        }
        System.out.println(Arrays.toString(newMassive));
        return newMassive;
    }
}
