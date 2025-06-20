package If_Else_Task;

public class Leap_Year {
    public static void main(String[] args) {
        int year=2024;
        if((year%4==0) && (year%100!=0)){
            System.out.println("Given year is leap year");
        } else if (year%400==0) {
            System.out.println("Given year is leap year");

        }
        else{
            System.out.println("Given year is not leap year");
        }


    }

}
