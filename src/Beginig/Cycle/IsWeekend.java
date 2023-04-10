package Beginig.Cycle;

/*
Реализовать метод, который будет принимать строку с названием дня недели, и отвечать, является ли этот день  выходным.
Список дней недели:
"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday".
Если строка не соответствует ни одному дню недели отправлять false.

 Для тернарного: "Ура, выходной!". В других случаях возвращать строку "Надо еще поработать".
 */
public class IsWeekend {
    public static boolean isWeekend(String weekday) {
        /* SWITCH
        switch (weekday) {
            case "Saturday", "Sunday":
                return true;
        }
        return false; */
        // IF ELSE statement
        if (weekday.equals("Saturday") | weekday.equals("Sunday")) {
            return true;
        } else {
            return false;
        }
        // return weekday.equals("Saturday")  ? "Ура, выходной!" : "Надо еще поработать";
    }
}
