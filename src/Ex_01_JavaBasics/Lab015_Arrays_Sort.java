package Ex_01_JavaBasics;

import java.util.Arrays;

public class Lab015_Arrays_Sort {
    public static void main(String[] args) {

        int[] a={4,20,40,80,100,3,2,1,5};
        int size=a.length;
        Arrays.sort(a);
        System.out.println("min of array->"+a[0]);
        System.out.println("max of array->"+a[size-1]);


    }

}
