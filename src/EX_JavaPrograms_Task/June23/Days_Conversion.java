package EX_JavaPrograms_Task.June23;

public class Days_Conversion {

    public static void main(String[] args) {

        int year = 0;
        int month = 0;
        int day = 0;
        int days=200;

        if(days>=365)
        {
            year = days/365;
            int rem_days = days%365;

            month = rem_days/30;
            day = rem_days%30;

            System.out.println(year + " years " + month+ " months " +day+" days ");
        }

        else if(days>=0 && days<365)
        {
            month = days/30;
            int rem_days = days%30;

            day = rem_days%30;

            System.out.println( month+ " months "+day+" days ");
        }
        else
        {
            System.out.println("Days must be a positive number");
        }
    }
}
