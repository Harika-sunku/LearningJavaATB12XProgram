package EX_JavaPrograms_Task.June24;

public class PrimeNumber_ReverseOrder {

    public static void main(String[] args) {

        for (int i = 10; i >= 0; i--) {
            boolean isPrime = true;

            if (i <= 1) {
                System.out.println(i + " is not a prime number");
                continue;
            }

            for (int j = 2; j <= i / 2; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " is a prime number");
            } else {
                System.out.println(i + " is not a prime number");
            }
        }


    }

}
