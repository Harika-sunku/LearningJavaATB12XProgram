package Ex_01_JavaBasics;

import java.util.Scanner;

public class Lab009_Squareroot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  number:");
        int num = scanner.nextInt();

       double value= Square(num);
        System.out.println(value);
    }

    static double Square(int num){

      return Math.sqrt(num);

    }

}
