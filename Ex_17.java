package Lesson1;


// Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера

    public class Ex_17 {
        public static void main(String... asf)
        {

            for(int i =0; i<256; i++)
            {
                System.out.println( i + ". " + (char)i);
            }
        }
    }
