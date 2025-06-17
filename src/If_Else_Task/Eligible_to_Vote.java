package If_Else_Task;

import java.util.Scanner;

public class Eligible_to_Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Eligible for vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }


    }
}
