package Test;

public class Challenge_5 {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 2;
        int result1 = a + b * c;
        System.out.println("a + b * c = " + result1 + " (evaluated as 10 + (5 * 2))");

        int result2 = (a + b) * c;

        System.out.println("(a + b) * c = " + result2 + " (evaluated as (10 + 5) * 2)");

    }
}
