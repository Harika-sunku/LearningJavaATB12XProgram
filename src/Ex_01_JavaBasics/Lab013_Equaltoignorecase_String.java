package Ex_01_JavaBasics;

public class Lab013_Equaltoignorecase_String {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="hello";
        System.out.println(s1.equalsIgnoreCase(s2));//true
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.length());//5
        System.out.println(s2.toUpperCase());//HELLO



    }



}
