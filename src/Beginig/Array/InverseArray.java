package Beginig.Array;

/*
Задание: Написать метод, который принимает массив, разворачивает его и возвращает.

Пример ввода: {1, 4, 6, 7}
Пример вывода: [7, 6, 4, 1]
 */

public class InverseArray {
    public static int[] inverseArray(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int newArray = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = newArray;
        }
        System.out.print("[");
        for (int c = 0; c < numbers.length; c++) {
            System.out.print(numbers[c]);
            if (c < numbers.length - 1) {
                System.out.print(", ");
            } else {
                System.out.print("]");
            }
        }
        return numbers;
    }
}
