package Ex_16_Exceptions;

public class Lab164_exceptions {
    public static void main(String[] args) {

        int a=0;


        try {
            a=10/0;
        } catch (Exception e) {
          e.printStackTrace();
        }
        System.out.println(a);


    }
}
