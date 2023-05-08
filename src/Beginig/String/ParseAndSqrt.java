package Beginig.String;
/*
Цель: Преобразование сроки в число

Что нужно знать:
1. Класс String
2. Класс Long
3. Класс Math

Задание:
Реализовать метод, который будет принимать целочисленное (long) число в строковом виде (например "14213123"),
преобразовывать его в тип long, вычислять из него квадратный корень, и округлять получившееся значение до ближайшего
long. Для округления воспользуйтесь классом Math.

Пример ввода: "64"
Пример вывода: 8

Пример ввода: "5"
Пример вывода: 2

Требования:
метод должен быть public static
сигнатура метода parseAndSqrt(String number)
метод возвращает long
 */

public class ParseAndSqrt {
    public static long parseAndSqrt(String number) {
        long num = Long.parseLong(number);
        double num2 = Math.sqrt(num);
        num = Math.round(num2);
        System.out.println(num);
        return num;
    }
}
