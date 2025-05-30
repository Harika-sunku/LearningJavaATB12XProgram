package EX_JavaPrograms_Task;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = scanner.nextInt();
        int fact=1;
        if(num<=0){
            fact=1;
        }
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.print("Factorial of number "+num+": "+fact);
    }

}
