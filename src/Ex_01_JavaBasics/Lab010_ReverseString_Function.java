package Ex_01_JavaBasics;

import java.util.Scanner;



public class Lab010_ReverseString_Function {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  word:");
        String word = scanner.nextLine();

       String revword=reversestring(word);
        System.out.print("reversed word is:"+ revword);

    }

    static String reversestring(String word){

        String revword="";
        for(int i=word.length()-1 ;i>=0;i--){

           revword=revword+word.charAt(i);
        }


        return revword;

    }



}
