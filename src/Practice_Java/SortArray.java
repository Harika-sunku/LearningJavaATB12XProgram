package Practice_Java;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int[] a={40,50,60,1, 2,80, 3,20, 4, 5};
       Arrays.sort(a);

        for (int number : a) {
            System.out.print(number + " ");
        }

    }
}
