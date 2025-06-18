package Practice_Java;

public class Duplicate_Elements_Array2 {
    public static void main(String[] args) {
        int[] arr={2,3,4,2,3,4};

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                if((arr[i]==arr[j]) && (i!=j) ){
                    System.out.print(arr[j]+" ");
                }

            }


        }
    }


}
