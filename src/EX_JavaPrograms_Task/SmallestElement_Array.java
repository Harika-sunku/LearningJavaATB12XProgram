package EX_JavaPrograms_Task;

public class SmallestElement_Array {
    public static void main(String[] args) {

        int[] b={5,30,1,60,80,40};
        int min=b[0];
        for(int i=0;i<b.length;i++ ){
            if(b[i]<min){
                min=b[i];
            }
        }
        System.out.println("Smallest element of an array is->"+min);



    }


}
