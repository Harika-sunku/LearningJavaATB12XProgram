package EX_JavaPrograms_Task.June24;

public class Factorial_Number_For_loop {
    public static void main(String[] args) {

        int n=10;
        int fact=1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);

    }
}
