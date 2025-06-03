package Ex_01_JavaBasics;

import java.util.Arrays;
import java.util.List;

public class Lab016_String_Methods {
    public static void main(String[] args) {

        String s=" My name is Harika ";
        String s1=s.trim();
        System.out.println(s.trim());//trim

        System.out.println(s1.substring(11,17));//Substring

       String[] b= s1.split(" ");//split
        System.out.println(Arrays.toString(b));


        System.out.println(s1.charAt(11));//charAt

        System.out.println(s1.indexOf("k"));//indexof

        System.out.println(s1.lastIndexOf("a"));//lastindexof








    }


}
