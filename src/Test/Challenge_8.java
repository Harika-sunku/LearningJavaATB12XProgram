package Test;

public class Challenge_8 {
    public static void main(String[] args) {

        int year=1600;
        boolean isLeapYear = false;

        if((year%4==0 && year%100 !=0) || year%400==0 ){
            isLeapYear = true;
        }
        if (isLeapYear) {
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not leap year");
        }


    }
}
