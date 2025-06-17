package Ex_16_Exceptions;

import java.util.Scanner;

public class Lab167_Try_Catch_Finally {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();

        try {
            int a=10/v;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
             finally {
            sc.close();
            System.out.println("Closing sc");
        }



    }
}
