package Ex_08_Switch;

import java.util.Scanner;

public class Lab093_Switch {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7");
        if (sc.hasNext()) {

            int day = sc.nextInt();

            switch(day){

                case 1:
                    System.out.println("Monday");
                    break;

                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;

                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;

                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;

                default:
                    System.out.println("Enter int number from 1 to 7 only, you fool!");
                    break;


            }

        }
        else {
            System.out.println("You are mad, Why you are entering non int values");
        }



    }

}
