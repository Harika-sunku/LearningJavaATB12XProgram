package Ex_04_TypeCasting;

public class Lab070_TypeCasting_Narrowing {
    public static void main(String[] args) {

        int val = 300;
          //byte b = val; // Narrowing - Implicit JVM to do it. - Data loss will be there.-->not possible
        byte b1 = (byte) val; // Narrowing - EXPLICIT JVM to do it. - Data loss will be there.
        System.out.println(b1); // 44




    }

}
