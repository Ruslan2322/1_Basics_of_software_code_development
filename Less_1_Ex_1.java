package Lesson1;
import java.util.Scanner;

//Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.

public class Less_1_Ex_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите значение а: ");
        int a = s.nextInt();
        System.out.println("Введите значение b: ");
        int b = s.nextInt();
        System.out.println("Введите значение c: ");
        int c = s.nextInt();
        double z = (((a-3)*b/2)+c);
        System.out.println(z);
    }
}