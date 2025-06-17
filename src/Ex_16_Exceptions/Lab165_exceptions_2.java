package Ex_16_Exceptions;

public class Lab165_exceptions_2 {
    public static void main(String[] args) {

        String s=null;
        try {
            s.trim();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
