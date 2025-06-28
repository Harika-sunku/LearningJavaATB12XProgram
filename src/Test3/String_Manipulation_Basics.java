package Test3;

public class String_Manipulation_Basics {

    public static void main(String[] args) {

        String s="Hello";
        s=s.concat("World");
        System.out.println("Concat: "+s);
        System.out.println("Length:"+s.length());
        System.out.println("First char:"+ s.charAt(0));
        System.out.println("Sub string:"+ s.substring(5,10));

    }
}
