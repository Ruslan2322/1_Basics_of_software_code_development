package Lesson_01;

// Дано действительное число R вида nnn.ddd(три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.

public class Ex_4 {
    public static void main(String... asf) {
// Предположим число R равно 457.987
        double R = 457.987;
        double R1 = (int) R;
        //System.out.println(R1);
        double result1 = R1 / 1000;
        double result=  result1 + (R - R1) * 1000;
        System.out.println(result);
    }
}
