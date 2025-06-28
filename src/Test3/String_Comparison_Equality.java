package Test3;

public class String_Comparison_Equality {
    public static void main(String[] args) {

        String s1="Hello";
        String s2="hello";

        System.out.println("equals: "+s1.equals(s2));
        System.out.println("equalsIgnoreCase(): "+s1.equalsIgnoreCase(s2));
        System.out.println("compareTo(): "+s1.compareTo(s2));


    }
}
