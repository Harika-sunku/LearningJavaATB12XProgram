package Ex_01_JavaBasics;

import java.util.Scanner;

public class Max_of_two_numbers {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=scanner.nextInt();
        System.out.print("Enter Second number:");
        int b=scanner.nextInt();
        int maxnumber=maximum(a,b);
        System.out.println("Maximum number is:"+maxnumber);

    }

    static int maximum(int a,int b){
        return Math.max(a,b);
    }


}
