package Ex_01_JavaBasics;

public class Lab023_Star_Pattern6 {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){

                System.out.print("_ ");
            }
            for(int k=1;k<(i*2);k++){
                System.out.print(" *");
            }



            System.out.println();
        }




    }



}
