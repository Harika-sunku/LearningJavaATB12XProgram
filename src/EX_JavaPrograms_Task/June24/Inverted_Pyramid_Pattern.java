package EX_JavaPrograms_Task.June24;

public class Inverted_Pyramid_Pattern {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++){

            for(int k=5;k>(i*2);k--){
                System.out.print("* ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }



            System.out.println();
        }



    }
}
