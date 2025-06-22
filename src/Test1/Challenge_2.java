package Test1;

public class Challenge_2 {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division (integer division)
        System.out.println("a % b = " + (a % b)); // Modulus (remainder)

        // Assignment Operators
        System.out.println("Assignment Operators:");

        int x = a; // =
        System.out.println("x = a => x = " + x);

        x += b; // x = x + b
        System.out.println("x += b => x = " + x);

        x -= b; // x = x - b
        System.out.println("x -= b => x = " + x);

    }
}
