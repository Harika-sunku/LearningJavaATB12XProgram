package EX_JavaPrograms_Task.June24;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();

        for(int i=1;i<=10;i++){

            System.out.printf("%d * %d = %d\n ",n,i,n*i);

        }


    }
}
