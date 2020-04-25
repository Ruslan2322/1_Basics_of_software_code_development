package Lesson1;


//Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа

import java.util.Scanner;

      public class Ex_12 {
        public static void main(String[] args) {
            System.out.print("Введите любое целое положительное число и нажмите Enter: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum = 0;
            for (int i=1; i<= n; i++){
                sum = sum + i;
                System.out.println(i);
            }
            System.out.println ("Сумма всех чисел: "+ sum);
        }
    }
