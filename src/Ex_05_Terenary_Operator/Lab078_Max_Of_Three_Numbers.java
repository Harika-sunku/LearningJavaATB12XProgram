package Ex_05_Terenary_Operator;

public class Lab078_Max_Of_Three_Numbers {
    public static void main(String[] args) {
        int n1=8;
        int n2=20;
        int n3=5;

        int max=(n1>n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
        System.out.println(max);



    }

}
