package Lesson1;


//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// (sin x + cos x)/(cos x - sin y)*tg(x*y)


import static java.lang.Math.*;
public class Ex_3 {
    public static void main(String... asf) {
        // Объявим переменные типа double x и y
        // Нужно импортировать toRadians, cos, sin

        double x = 30.0;
        double x1 = toRadians(x); // sin x
        double x2 = toRadians(x); // cos x
        double x3 = sin(x1) % cos(x2); // tg x
//        System.out.println(sin(x1));
//        System.out.println(cos(x2));
//        System.out.println(tan(x3));

        double y = 45.0;
        double y1 = toRadians(y); // sin y
        double y2 = toRadians(y); // cos y
        double y3 = sin(y1) % cos(y2); // tg y
//        System.out.println(sin(y1));
//        System.out.println(cos(y2));
//        System.out.println(tan(y3));

        // Значение выражения z выглядит следующим образом

        double z = ((sin(x1) + cos(y2)) % (cos(x2) - sin(y1))) % (tan(x3) + tan(y3));
        System.out.println(z);
    }
}