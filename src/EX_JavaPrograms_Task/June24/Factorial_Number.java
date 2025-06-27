package EX_JavaPrograms_Task.June24;

import java.util.Scanner;

public class Factorial_Number {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        int result = 1;
        int i = n;

        while (i > 1) {
            result = result * i;
            i--;
        }

        System.out.println("Factorial of " + n + " is: " + result);

        sc.close();


    }


}
