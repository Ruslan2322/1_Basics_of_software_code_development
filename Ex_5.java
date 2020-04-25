package Lesson1;


// Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
// Вывести значение длительности в часах, минутах, секундах в следующей форме: ННм ММм SSc

   public class Ex_5 {
        public static void main(String... asf) {
            long T = 87896799;

            long HH = 0;
            long MM = 0;
            long SS = 0;

            HH = T / 3600;
            MM = (T - HH * 3600) / 60;
            SS = T - HH * 3600 - MM * 60;
            System.out.println(HH + "ч "+ MM + "м " + SS + "с " );
        }
    }
