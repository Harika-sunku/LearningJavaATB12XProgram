package Ex_01_JavaBasics;

import java.util.Arrays;

public class Array_Practice2 {
    public static void main(String[] args) {
        int[] a=new int[5];
        a[0]=0;
        a[1]=1;
        a[2]=2;
        a[3]=3;
        a[4]=4;
        //System.out.println(a);->not a correct way to print arrays
        System.out.println(Arrays.toString(a));
        for(int b:a){
            System.out.print(b);
        }


    }


}
