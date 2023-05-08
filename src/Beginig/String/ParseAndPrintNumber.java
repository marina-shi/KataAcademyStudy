package Beginig.String;

/*
Реализуйте метод.

Требования:
Метод не должен быть статическим.
Метод не должен ничего возвращать.
Метод принимает в качестве параметра строку, например "1234".
Метод должен получать из строки число типа int, делить его на 2 и выводить его в консоль, используя System.out.println.

Примеры:
Пример ввода: "1200"
Пример вывода: 600
 */
public class ParseAndPrintNumber {
    public void parseAndPrintNumber(String str) {
        System.out.println(Integer.parseInt(str) / 2);
    }
}
