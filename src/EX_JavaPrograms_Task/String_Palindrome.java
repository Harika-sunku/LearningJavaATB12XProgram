package EX_JavaPrograms_Task;

import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word:");
        String word = scanner.next();
        int length=word.length();
        String rev="";

        for(int i=length-1;i>=0;i--){

            rev +=word.charAt(i);

        }

        if(word.equalsIgnoreCase(rev)){
            System.out.println("Given string is palindrome");
        }
        else{
            System.out.println("Given string is not palindrome");
        }

    }

}
