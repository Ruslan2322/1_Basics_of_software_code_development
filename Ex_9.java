package Lesson_01;

//Даны три точки A(x1,y1),B(x2,y2) и C(x3,y3). Определить , будут ли они расположены на одной прямой.

public class Ex_9 {
    public static void main(String[] args) {

        double x1 = 1, y1 = 1;
        double x2 = 1, y2 = 1;
        double x3 = 1, y3 = 1;

        if (x1 == x2 && x2 == x3 && x1 == x3 && y1 == y2 && y2 == y3 && y1 == y3)
            System.out.println("Точки на одной прямой");
        else
            System.out.println("Точки не лежат на одной прямой");
    }
}
