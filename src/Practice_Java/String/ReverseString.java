package Practice_Java.String;

public class ReverseString {
    public static void main(String[] args) {

        String s="Harika";


        StringBuilder sb=new StringBuilder(s);
        String rev= sb.reverse().toString();
        System.out.println("revers string is "+ rev);



    }
}
