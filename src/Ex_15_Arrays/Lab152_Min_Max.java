package Ex_15_Arrays;

public class Lab152_Min_Max {

    public static void main(String[] args) {

        int[] b={40,80,100,30,20};

        int min=b[0];
        //int max=b[0];

        for(int i=0;i<b.length;i++){
            if(b[i]<min){
                min=b[i];

               /* logic
                for(int i=0;i< array.length;i++){
                    if(array[i] > max){
                        max = array[i];
                    }
          //
                 */

            }



        }

        System.out.println(min);

    }
}
