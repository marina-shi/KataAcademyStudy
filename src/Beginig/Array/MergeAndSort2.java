package Beginig.Array;

import java.util.Arrays;

/*
Реализовать метод mergeAndSort(int[] firstArray, int[] secondArray), который принимает, соединяет и сортирует
два произвольных массива чисел.
Пример ввода: {1, 3, 7, 5}, {8, 4, 2, 4}
Пример вывода: [1, 2, 3, 4, 4, 5, 7, 8]
 */
public class MergeAndSort2 {
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] newArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, newArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, newArray, firstArray.length, secondArray.length);
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
}
