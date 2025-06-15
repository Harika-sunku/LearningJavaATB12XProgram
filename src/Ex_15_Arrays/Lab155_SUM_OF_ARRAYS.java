package Ex_15_Arrays;

public class Lab155_SUM_OF_ARRAYS {
    public static void main(String[] args) {

        int[] b={40,80,100,30,20};
        int sum=0;

        for(int i=0;i<b.length;i++){
            sum+=b[i];
        }
        System.out.println(sum);

    }

}
