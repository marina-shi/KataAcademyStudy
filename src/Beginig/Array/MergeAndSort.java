package Beginig.Array;
/*
Задание:
Реализовать метод mergeAndSort(int[] firstArray, int[] secondArray), который принимает соединяет и сортирует два
произвольных массива чисел.

Пример ввода: {1, 3, 7, 5}, {8, 4, 2, 4}
Пример вывода: [1, 2, 3, 4, 4, 5, 7, 8]
 */

public class MergeAndSort {
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        // объединение массивов
        int[] newMassive = new int[firstArray.length + secondArray.length];
        int count = 0;
        for (int i = 0; i < firstArray.length; i ++) {
            newMassive[i] = firstArray[i];
            count++;
        }
        for (int k = 0; k < secondArray.length; k++) {
            newMassive[count++] = secondArray[k];
        }

        // cортировка. запрет на использование Arrays
        for (int i = 0; i < newMassive.length; i++) {
            for (int j = i + 1; j < newMassive.length; j++) {
                int num = 0;
                if (newMassive[i] >= newMassive[j]) {
                    num = newMassive[i];
                    newMassive[i] = newMassive[j];
                    newMassive[j] = num;
                }
            }
        }

        // вывод на экран
        System.out.print("[");
        for (int c = 0; c < newMassive.length; c++) {
            System.out.print(newMassive[c]);
            if (c < newMassive.length - 1) {
                System.out.print(", ");
            } else {
                System.out.print("]");
            }
        }
        return newMassive;
    }
}
