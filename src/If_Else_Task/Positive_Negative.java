package If_Else_Task;

import java.util.Scanner;

public class Positive_Negative {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        if(num>0){
            System.out.println("Given number is positive");
        }
        else{
            System.out.println("Given number is negative");
        }
        sc.close();


    }
}
