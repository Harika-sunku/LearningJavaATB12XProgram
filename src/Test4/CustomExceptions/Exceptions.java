package Test4.CustomExceptions;

public class Exceptions {
    public static void main(String[] args) {

        int[] numbers={10,0};

        try {
            //int result=numbers[0]/numbers[1];
            //System.out.println("Result: " + result);

            int value = numbers[2];
            System.out.println("Value: " + value);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }


    }

}
