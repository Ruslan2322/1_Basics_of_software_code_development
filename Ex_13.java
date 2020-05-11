package Lesson_01;

import java.util.Scanner;
//Вычислите значение функции на отрезке [a,b] с шагом h: (Подробности Циклы: задача 2 https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf)
public class Ex_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start line A");
        int a = scanner.nextInt();
        System.out.println("Enter finish line B");
        int b = scanner.nextInt();
        System.out.println("Enter step h");
        double h = scanner.nextDouble();
        System.out.println("Enter the value of x");
        int x = scanner.nextInt();
        int  y;

        for (double i = a; i <= b; i = i + h) {
            if (x > 2) {
                y = x;
            } else
                y = -x;
            System.out.println("x = "+ x + "\n" + "y = " + y);
        }
    }
}
