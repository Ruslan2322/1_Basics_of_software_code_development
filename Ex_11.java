package Lesson_01;

// Вычислить значение функции (Ветвления: задача 5) https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        //Вычислить значение функции:
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter x ");
        double x = scanner.nextDouble();

        double g, z;
        if (x<=3){
            z = Math.pow(x,2)-3*x+9;
            System.out.printf("Result 1: %.1f ", z);
        } else if (x > 3) {
            g = 1 / (Math.pow(x, 3) + 6);
            System.out.printf("Result 2: %.1f ", g);
        }
    }
}
