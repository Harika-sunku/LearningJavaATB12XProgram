package Test1;

public class Challenge_13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Multiplication Table for " + i + ":");


            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }


            System.out.println();
        }

    }
}
