package Lesson1;

// Заданы размеры A,B прямоугольного отверстия и размеры x,y,z кирпича. Определить, пройдет ли кирпич через отверстие.

import java.util.Random;


     public class Ex_10 {
        public static void main(String[] args) {
            Random ar = new Random();
            Random br = new Random();

// Произвольные размеры дыры в стене
            int a = ar.nextInt(300);
            int b = br.nextInt(300);

// Запишем размеры кирпича
            int x = 40;
            int y = 190;
            int z = 60;

            if (x <= a && y <= b || y <= a && x <= b ||
                    x <= a && z <= b || z <= a && x <= b ||
                    z <= a && y <= b || y <= a && z <= b)
                System.out.println("Пройдёт");
            else
                System.out.println("Не пройдет");
        }
    }
