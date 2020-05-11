package Lesson_01;

// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Ex_19 {
    public static void main(String[] args) {

        int[] number1 = {1, 3, 4};
        int[] number2 = {2, 3, 4};
        for (int v : number1)
            System.out.print(v);
        System.out.print(" ");
        for (int v1 : number2)
            System.out.print(v1);
        {
            int[] number3 = new int[number1.length];
            int count = 0;

            for (int i = 0; i < number1.length;i++) {
                if (number1[i] == number2[i]) {
                    number3[count] = number1[i];
                    count++;
                    System.out.println(" ");
                    for (int v2 : number3)
                        System.out.print(v2);

                }
            }
        }
    }
}
