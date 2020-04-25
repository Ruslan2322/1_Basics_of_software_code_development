package Lesson1;

// Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник , и если да ,
// то будет ли он прямоугольным.

import java.util.Random;

   public class Ex_7 {
        public static void main(String[] args) {

            double Min = 0.0;
            double Max = 360.0;
            Random r = new Random();
            double x = Min + (Max - Min) * r.nextDouble(); // угол x
            double y = Min + (Max - Min) * r.nextDouble(); // угол y
//double x = 45.0;
//double y = 45.0;
            System.out.println("Угол 1: "+x);
            System.out.println("Угол 2: "+y);

            double z = x + y; // сумма 2х углов
            double z1 = 180.0 - z;
//        System.out.println(z);
//        System.out.println(z1);
            double t = 180.0; // сумма углов треугольника

            if (z < 180.0) {
                System.out.println("Triangle: " + true);
                if (z1 == 90) {
                    System.out.println("Triangle: rectangular");
                }
            } else {
                System.out.println("Impossible");
            }
        }
    }
