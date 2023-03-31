import java.math.*;

public class CircleRaduis {
    /*
    Реализовать метод calcCircleRaduis(double area), который вычисляет радиус окружности по заданной площади
    и выводит его на экран. Точность - 3 знака после запятой. Для указания количества знаков после запятой
    используйте метод для форматированного вывода System.out.printf
     */
    public static void calcCircleRadius(double area) {
        double radius = Math.sqrt(area / Math.PI);
        System.out.printf("%.3f", radius);
    }

}
