package Lesson_01;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//(b + sqrt(b^2 + 4*a*c))/2 - a^3*c +(1/b^2)

public class Ex_2 {
    public static void main(String... asf) {
        // Объявим переменные для степеней переменных
        int v1 = 2;
        int v2 = 3;
        int v3 = -2;
        double z;
// Объявим значения переменных с = 1.0 , b = 2.0, a = 3.0
        double c = 5.0;
        double a = 2.0, a1 = Math.pow(a, v2);
        double b = 1.0, b1 = Math.pow(b, v1), b2 = Math.pow(b, v3);
        double t = Math.sqrt(Math.pow(b, a1) + 4 * a * c);
        double t1 = (b + t) % 2 * a;
        z = t1 - a1 * c + b2;

        System.out.println(z);

    }
}