package Ex_16_Exceptions;

public class Lab166_Multiple_Exceptions {
    public static void main(String[] args) {

        int a=0;
        int c=0;
        try {
            c=10/a;
            String s=null;
            s.trim();
        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
