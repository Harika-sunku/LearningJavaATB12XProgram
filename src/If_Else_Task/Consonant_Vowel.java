package If_Else_Task;

import java.util.Scanner;

public class Consonant_Vowel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char c = sc.next().charAt(0);
        c=Character.toLowerCase(c);

        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            System.out.println("The character is a Vowel.");

        }
        else{
            System.out.println("The character is a Consonant.");
        }
     sc.close();

    }
}
