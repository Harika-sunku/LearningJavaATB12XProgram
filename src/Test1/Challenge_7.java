package Test1;

import java.util.Scanner;

public class Challenge_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three integers
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();


        if (a > b && a > c) {
            System.out.println("The largest number is: " + a);
        } else if (b > a && b > c) {
            System.out.println("The largest number is: " + b);
        } else if (c > a && c > b) {
            System.out.println("The largest number is: " + c);
        } else {

            if (a == b && b == c) {
                System.out.println("All three numbers are equal.");
            } else if (a == b && a > c) {
                System.out.println("First and second numbers are the largest and equal: " + a);
            } else if (a == c && a > b) {
                System.out.println("First and third numbers are the largest and equal: " + a);
            } else if (b == c && b > a) {
                System.out.println("Second and third numbers are the largest and equal: " + b);
            } else {
                System.out.println("Two or more numbers are equal but not the largest.");
            }
        }

        scanner.close();

    }
}
