package Practice_Java;

public class Smallest_Element_Array {
    public static void main(String[] args) {
        int[] a={1, 2, 3,20, 4,0,-2, 5};
        int min=a[0];

        for(int a1:a){

            if(a1<min){
                min=a1;
            }
        }
        System.out.println(min);

    }
}
