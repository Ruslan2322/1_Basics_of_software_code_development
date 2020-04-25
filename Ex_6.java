package Lesson1;


// Для данной области составить линейную программу , которая печатает true , если точка с координатами (x,y)
// принадлежит закрашенной области , и false - в противном случае

import java.util.Random; // импортируем класс Random
     public class Ex_6 {
        public static void main(String[] args) {

            Random rx = new Random();
            Random ry = new Random();

            int x = rx.nextInt(15) -6;
            int y = ry.nextInt(12) -4;

            {
                if (x > 0 && y > 0) {
                    if (x < 3 && y < 5) {
                        System.out.println(true);
                        return;
                    }
                }

                if (x < 0 && y > 0) {
                    if (x > -3 && y < 5) {
                        System.out.println(true);
                        return;
                    }
                }
                if (x > 0 && y < 0) {
                    if (x < 5 && y > -4) {
                        System.out.println(true);
                        return;
                    }
                }
                if (x < 0 && y < 0) {
                    if (x > -5 && y > -4) {
                        System.out.println(true);
                        return;
                    }
                }
                System.out.println(false);
            }
        }
    }
