package EX_JavaPrograms_Task;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Year:");
        int year= scanner.nextInt();

        if((year%4==0) && !(year%100==0) ){
            System.out.print("Entered year is leap Year");
        }
        else if(year%400==0) {
            System.out.print("Entered year is  leap Year");
        }
        else  {
            System.out.print("Entered year is Not leap Year");
        }

    }

}
