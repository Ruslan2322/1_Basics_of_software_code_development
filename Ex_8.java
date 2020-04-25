package Lesson1;

// Найти max{min(a,b),min(c,d)}


      public class Ex_8 {
        public static void main(String[] args) {

            int max;
            int a = 5;
            int b = 6;
            int c = 7;
            int d = 8;

            int z;
            z = Math.min(a, b);
//        System.out.println(z);
            int z1;
            z1 = Math.min(c, d);
//        System.out.println(z1);

            if (z > z1) {
                max = z;
            } else {
                max = z1;
            }
            System.out.println(max);
        }
    }
