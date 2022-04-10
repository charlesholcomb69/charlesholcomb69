package Class02;

public class Task {
    /*
            * shortcut to format code: mac cmd+shift+f windows ctrl+shift+f
 */
    public static void main(String[] args) {
        System.out.println("              TASK 1              ");
        double n1 = 15.99;
        double n2 = 6.01;
        double sum = n1 + n2;
        double sub = n1 - n2;
        double mul = n1 * n2;
        double div = n1 / n2;
        System.out.println("The add of 2 numbers " + n1 + " and " + n2 + "is equal to " + sum);
                System.out.println("The subtract of 2 numbers " + n1 + " and " + n2 + "is equal to " + sub);
                        System.out.println("The multiply of 2 numbers " + n1 + " and " + n2 + "is equal to " + mul);
                                System.out.println("The divide of 2 numbers " + n1 + " and " + n2 + " is equal to " + div);
                                        System.out.println("              TASK 2              ");
        /*
         * Write a program to find the square of the number 3.9.
         * You program should say “The square of the ____ is ____
         */
        double num = 3.9;
        double square = num * num;
        System.out.println("The square of the number " + num + " is " +
                square);
        System.out.println("              TASK 3              ");
/*
 * Write a program to print the area and perimeter of a rectangle with
width = 5
 * and height = 8. Your program should say. "The perimeter of a
rectangle with
 * width ___ and height ____ is equal to _____ and the area is __"
 */
        int width = 5;
        int height = 8;
        int perimeter = 2 * (width + height);
        int area = width * height;
        System.out.println("The perimeter of a rectangle wit width " + width +
                " and height " + height + " is equal to "
                + perimeter + " and the area is " + area);
    }
}
