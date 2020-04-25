package Lesson1;


// Найдите сумму квадратов первых ста чисел

      public class Ex_14 {
        public static void main(String[] args) {
            int n = 100, sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += Math.pow(i, 2);;
            }
            System.out.println("Сумма квадратов первых ста чисел= " + sum);
        }
    }
