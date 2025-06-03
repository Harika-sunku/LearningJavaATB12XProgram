package EX_JavaPrograms_Task;

public class Even_Odd_Array {
    public static void main(String[] args) {
        int[] b={5,30,1,60,80,40};

        for(int c:b){
           if(c%2==0){
               System.out.println(c+" is even number");

           }
           else{
               System.out.println(c+" is odd number");
           }


        }
    }

}
