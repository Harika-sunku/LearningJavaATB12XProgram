package Ex_01_JavaBasics;

public class Lab024_Star_Pattern7 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<(i*2);k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
