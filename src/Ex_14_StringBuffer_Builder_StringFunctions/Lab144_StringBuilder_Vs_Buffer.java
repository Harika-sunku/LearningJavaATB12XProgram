package Ex_14_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        String s0="Harika";
        String s1=new String("Harika");
        StringBuffer stringBuffer = new StringBuffer("Lakshmi");
        StringBuilder stringBuilder = new StringBuilder("Lakshmi");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());

    }
}
