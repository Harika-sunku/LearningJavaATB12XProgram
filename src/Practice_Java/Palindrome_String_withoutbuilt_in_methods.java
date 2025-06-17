package Practice_Java;

public class Palindrome_String_withoutbuilt_in_methods {
    public static void main(String[] args) {

        String s="Madam";
        boolean ispalindrome=true;
        s = s.toLowerCase();
        int len=s.length();
        for(int i=0;i<len/2;i++){
            char start=s.charAt(i);
            char end=s.charAt(len-1-i);
            if(start != end) {
                ispalindrome=false;
            }
        }

        if(ispalindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }

    }


    }


