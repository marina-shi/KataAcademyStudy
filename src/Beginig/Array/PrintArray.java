package Beginig.Array;

/*
Реализуйте метод, который будет принимать массив чисел, и выводить его значения в консоль.
 */

public class PrintArray {
    public static void printArray(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            } else {
                System.out.print("]");
            }
        }
    }
}
