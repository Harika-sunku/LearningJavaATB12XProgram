package Practice_Java;

public class Palindrome_StringBuilder {
    public static void main(String[] args) {

        String s="A man, a plan, a canal, Panama";
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(cleaned);

        String rev= new StringBuilder(cleaned).reverse().toString();

        if(cleaned.equalsIgnoreCase(rev)){
            System.out.println("The string is a palindrome.");
        }
        else{
            System.out.println("The string is not a palindrome.");
        }

    }
}
