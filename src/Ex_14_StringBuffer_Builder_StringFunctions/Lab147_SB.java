package Ex_14_StringBuffer_Builder_StringFunctions;

public class Lab147_SB {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);
        sb.replace(0, 4, "C++");
        System.out.println(sb);

    }
}
