package Test1;

public class Challenge_3 {
    public static void main(String[] args) {

        int a = 30;
        int b = 40;
        System.out.println("Comparison Operators:");
        System.out.println("a == b: " + (a == b));   // Equal to
        System.out.println("a != b: " + (a != b));   // Not equal to
        System.out.println("a < b: " + (a < b));     // Less than
        System.out.println("a > b: " + (a > b));     // Greater than
        System.out.println();


        System.out.println("Logical Operators:");
        boolean x = (a < b);
        boolean y = (a == 10);
        System.out.println("x = (a < b): " + x);     // true
        System.out.println("y = (a == 10): " + y);
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

    }
}
