package Test1;

public class Challenge_15 {
    public static void main(String[] args) {
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            // Check divisibility up to square root of num
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // Not a prime, exit inner loop
                }
            }


            if (isPrime) {
                System.out.print(num + " ");
            }
        }

        System.out.println();

    }
}
