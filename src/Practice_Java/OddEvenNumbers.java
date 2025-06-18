package Practice_Java;

public class OddEvenNumbers {
    public static void main(String[] args) {
        int[] a={40,50,60,1, 2,80, 3,20, 4, 5};
        System.out.print("Even number: ");

        for(int a1:a){
            if(a1%2==0){
                System.out.print(a1+ " ");
            }
        }
        System.out.print("\nOdd Numbers: ");
        for (int a2 : a) {
            if (a2 % 2 != 0) {
                System.out.print(a2 + " ");
            }
        }


    }
}
