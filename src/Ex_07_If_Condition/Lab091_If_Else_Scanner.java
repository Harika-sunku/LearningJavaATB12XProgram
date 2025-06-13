package Ex_07_If_Condition;

import java.util.Scanner;

public class Lab091_If_Else_Scanner {
    public static void main(String[] args) {

        System.out.print("Enter your age:");
       Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        if (age > 18){
            System.out.println("Allowed to Vote!");
        }else{
            System.out.println("Not allowed to Vote!");
        }


    }

}
