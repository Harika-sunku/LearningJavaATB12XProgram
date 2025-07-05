package Test4.CustomExceptions;

public class Try_Catch_Finally {

    public static void main(String[] args) {
     int a=10,b=0;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }

        finally {
            System.out.println("Finally block executed");
        }



    }
}
