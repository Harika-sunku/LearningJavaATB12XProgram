package Ex_14_StringBuffer_Builder_StringFunctions;

public class Lab146_Sbuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Appends text
        sb.reverse();
        System.out.println(sb);
    }
}
