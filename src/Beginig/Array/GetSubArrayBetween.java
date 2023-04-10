package Beginig.Array;
/*
Дан массив возрастающих чисел. Даны два числа. Задача - написать метод, который из данного массива достанет ту часть,
которая лежит между данными числами (включительно) и вернет ее в качестве массива.
 */

public class GetSubArrayBetween {
    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int count = 0;
        int first = 0;
        // int finish = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                count++;
                // finish = i;
            }
        }
        for (int k = 0; k < numbers.length; k++) {
            if (numbers[k] >= start && numbers[k] <= end) {
                first = k;
                break;
            }
        }
        int[] subarray = new int[count];
        // System.arraycopy(numbers, start, subarray, 0, subarray.length);

        System.out.print("[");
        for (int c = 0; c < subarray.length; c++) {
            subarray[c] = numbers[first + c];
            System.out.print(subarray[c]);
        }
        System.out.println("]");

        return subarray;
    }
}
