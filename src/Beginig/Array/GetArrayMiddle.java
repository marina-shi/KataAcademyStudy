package Beginig.Array;
    /*
    Дан массив произвольной длины. Необходимо вернуть центральную часть массива, причем, если массив четной длины,
    то вернуть массив из двух элементов, если нечетной, то вернуть массив из одного элемента.

    Требования:
        Метод должен быть public static
        Сигнатура метода getArrayMiddle(int[] numbers)
        Не использовать Arrays, System.arrayCopy
     */
public class GetArrayMiddle {
    public static int[] getArrayMiddle(int[] numbers) {
        int one = 0;
        int two = 0;
        int[] subarray;
        int index = 0;

        if (numbers.length % 2 == 0 && numbers.length != 0) {
            index = numbers.length / 2 - 1;
            one = numbers[index];
            two = numbers[index + 1];
            subarray = new int[]{one, two};
        } else if(numbers.length == 0) {
            subarray = new int[]{};
        } else {
            index = numbers.length / 2;
            one = numbers[index];
            subarray = new int[]{one};
        }
        System.out.print("[");
        for (int i = 0; i < subarray.length; i++ ) {
             System.out.print(subarray[i]);
            if (i < 1 && subarray.length == 2) {
                System.out.print(", ");
                continue;
            }
        }
        System.out.print("] ");
        return subarray;
    }

}
