package Ex_01_JavaBasics;
import java.util.Scanner;
public class Lab027_Printf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int x=sc.nextInt();

        System.out.println("=========================================");
        System.out.printf("%-15s%03d\n",s,x);

        System.out.println("=========================================");







    }



}
