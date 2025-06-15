package Practice_Java;

public class Palindrome_String {

    public static void main(String[] args) {

        String word="MAD";
        String rev="";
        int len=word.length();

        for(int i=len-1;i>=0;i--){

            rev=rev+word.charAt(i);
        }

        System.out.println(rev);

       if(rev.equalsIgnoreCase(word)){
            System.out.println("given string is palindrome.");
        }
        else {
            System.out.println("Not palindrome");
        }



    }
}
