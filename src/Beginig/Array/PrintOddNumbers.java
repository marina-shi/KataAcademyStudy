package Beginig.Array;
/*
Напишите метод printOddNumbers, который принимает массив и выводит в консоль только нечетные числа из него, через запятую.
Конец вывода должен перевести курсор на новую строку.
Пример ввода: [3,5,20,8,7,3,100]
Пример вывода: 3,5,7,3
 */
public class PrintOddNumbers {
    public static void printOddNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        int[] newMassive = new int[count];
        for (int i = 0; i < arr.length; i++) {
            for (int c = 0; c < arr.length; c++) {
                if (arr[i] % 2 != 0) {
                    newMassive[c] = arr[i];
                    count--;
                    if (count > 0) {
                        System.out.print(newMassive[c] + ", ");
                    } else {
                        System.out.println(newMassive[c]);
                    }
                    break;
            }

            }
        }
    }
}
