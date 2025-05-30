package Ex_01_JavaBasics;

import java.util.Scanner;

public class Lab008_EvenOdd_function {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  number:");
        int num = scanner.nextInt();

        if (isEven(num)) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

        static boolean isEven(int number) {
            return number % 2 == 0;
        }

}
