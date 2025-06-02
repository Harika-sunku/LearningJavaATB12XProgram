package Ex_01_JavaBasics;

import java.util.Arrays;

public class Array_Practice1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(a == b);           // prints false, because different objects.== on arrays compares the references (memory addresses), not the actual elements.
        System.out.println(a.equals(b));  // false (same as above)
        System.out.println(Arrays.equals(a, b)); // prints true, because elements are equal




        String[] c={"Harika","Akshay","Akshith","Lakshmi","Satya"};
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.equals(a,b));
        for(String d:c){
            System.out.println(d);
        }




    }


}
