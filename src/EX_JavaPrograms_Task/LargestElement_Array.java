package EX_JavaPrograms_Task;

public class LargestElement_Array {
    public static void main(String[] args) {

        int[] b={5,30,1,60,80,40};
        int max=b[0];

        for(int c:b){
            if(c>max){
                max=c;
            }
        }

        System.out.println("Largest element of an array is->"+max);

    }

}
