package Ex_01_JavaBasics;

import java.util.Arrays;

public class Lab011_String_Practice {
    public static void main(String[] args) {
        String s="  I am doing   practice of   string programs in java compiler   ";
        String s1=s.trim();//trim spaces from starting and ending
        System.out.println(s1);
        //String[] s2=s1.split(" ");//it will not handle extra spaces
        String[] s2=s1.split("\\s+");//split the words into an array.Handle extra spaces
        String s3=Arrays.toString(s2);//to print the array we use Arrays.toString
        System.out.println(s2.length);//number of words
    }





}
