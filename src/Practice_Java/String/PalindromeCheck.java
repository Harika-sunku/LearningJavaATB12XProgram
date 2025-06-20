package Practice_Java.String;

public class PalindromeCheck {
    public static void main(String[] args) {

        String s="Harika";
        s=s.toLowerCase();

        StringBuilder sb=new StringBuilder(s);
       String rev= sb.reverse().toString();

       if(s.equals(rev))
       {
           System.out.println("Palindrome");
       }
       else{
           System.out.println("Not palindrome");
       }

    }

}
