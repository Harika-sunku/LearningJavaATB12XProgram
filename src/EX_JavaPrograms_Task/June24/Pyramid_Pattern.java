package EX_JavaPrograms_Task.June24;

public class Pyramid_Pattern {
    public static void main(String[] args) {

        for(int i = 5; i >= 1; i--) {
            // Print leading spaces
            for(int j = 5; j > i; j--) {
                System.out.print("  ");
            }


            for(int k = 1; k < (i * 2); k++) {
                System.out.print("* ");
            }

            System.out.println();
        }


    }
}
