package EX_JavaPrograms_Task;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

       Scanner scanner=new Scanner(System.in) ;
        System.out.print("Enter a number: ");
        int num= scanner.nextInt();
        boolean flag = false;
        if(num<=0){
            flag=true;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                flag = true;
                break;
            }

        }
     if(!flag){
         System.out.println(num + " is a prime number.");
     }
     else{
         System.out.println(num + " is not a prime number.");
     }


    }


}
