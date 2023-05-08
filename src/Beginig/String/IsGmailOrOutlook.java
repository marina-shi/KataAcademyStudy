package Beginig.String;

/*
Цель: Работа с регулярными выражениями

Что нужно знать:
1. Классы String, Pattern, Matcher
2. Регулярные выражения

Задание:
Реализовать метод, который будет принимать целочисленное строку, и отвечать соответствует ли эта строка почтовому ящику
сервисов google (gmail.com) или майкрософт (outlook.com). Будет считать, что в корректном почтовом ящике можно
использовать только цифры и буквы.

Пример ввода: "kata12@gmail.com"
Пример вывода: true

Пример ввода: "@outlook.com"
Пример вывода: false

Требования:
метод должен быть public static
сигнатура метода isGmailOrOutlook(String email)
метод возвращает boolean
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsGmailOrOutlook {
    public static boolean isGmailOrOutlook(String email) {
        Pattern text = Pattern.compile("\\w+@\\w+\\.(com)");
        Matcher matcher = text.matcher(email);
        if (matcher.find()){  // не прошло решение на платформе. прошло при использовании return matcher.matches();
            return true;
        } else {
            return false;
        }
    }
}
