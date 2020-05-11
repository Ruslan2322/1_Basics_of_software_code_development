package Lesson_01;

// Составить программу нахождения произведения квадратов первых двухста чесел

public class Ex_15 {
    public static void main(String[] args) {
        long n = 200, sum = 1; //  Если sum = 0 , то все последующие числа будут умножаться на 0 и произведение будет равно 0;
        for (int i = 1; i <= n; i++) {
            sum *= Math.pow(i, 2);;
        }
        System.out.println("Произведение квадратов первых двухста чисел= " + sum);
    }
}
