package If_Else_Task;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num%2==0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd number");
        }
        sc.close();
    }
}
