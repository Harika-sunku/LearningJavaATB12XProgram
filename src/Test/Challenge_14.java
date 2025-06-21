package Test;

import java.util.Scanner;

public class Challenge_14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("\nRight Triangle Pattern:");
        // Right Triangle Pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nPyramid Pattern:");
        // Pyramid Pattern
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();

    }
}
