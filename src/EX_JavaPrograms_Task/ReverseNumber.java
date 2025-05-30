package EX_JavaPrograms_Task;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number:");
        int num= scanner.nextInt();
        int rev=0;

        for(;num!=0;num/=10){
            int digit=num%10;
            rev=rev*10+digit;

        }
        System.out.println("Reversed Number: " + rev);

    }
}
