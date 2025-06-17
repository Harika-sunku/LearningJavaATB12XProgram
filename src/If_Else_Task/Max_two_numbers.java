package If_Else_Task;

import java.util.Scanner;

public class Max_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        if(n1>n2){
            System.out.println("Maximum number is: " + n1);
        }
        else{
            System.out.println("Maximum number is: " + n2);
        }

sc.close();

    }

}
