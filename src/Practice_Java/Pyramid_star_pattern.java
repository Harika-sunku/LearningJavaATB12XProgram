package Practice_Java;

public class Pyramid_star_pattern {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }

            for(int k=1;k<(i*2);k++){
                System.out.print("*");
            }

            System.out.println();
        }





    }
}
