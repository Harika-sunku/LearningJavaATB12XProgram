package Test4.CustomExceptions;

public class Main {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        int[] testAges = {20, 15};

        for (int age : testAges) {
            try {
                checkAge(age);
            } catch (InvalidAgeException e) {
                System.out.println("InvalidAgeException: " + e.getMessage());
            }
        }
    }
}
