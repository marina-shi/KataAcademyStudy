public class СharExpression {

    /*
    Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш)
    на расстоянии a.
    */

    public static char charExpression(int a) {
        // char ch = '\\';
        return (char) ((int) '\\' + a);
    }
}
