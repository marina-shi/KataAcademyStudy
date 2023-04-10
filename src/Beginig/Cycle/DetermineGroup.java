package Beginig.Cycle;

/* В спортивном центре есть три возрастные группы для занятий волейболом 1 - от 7 до 13 лет, 2 - от 14 до 17 лет,
3 - от 18 до 65 лет.

 Напишите публичный нестатичный метод determineGroup, который принимает возраст человека и возвращает целое число,
 которое обозначает номер группы в которую его надо определить, если подходящей группы нет - верните -1.

 */

public class DetermineGroup {
    public static int determineGroup(int age) {
        int group = 0;

        if (age >= 7 && age <= 13) {
            group = 1;
        } else if (age >= 14 && age <= 17) {
           group = 2;
        } else if (age >= 18 && age <= 65) {
            group = 3;
        } else {
            group = -1;
        }
        return group;
    }
}
