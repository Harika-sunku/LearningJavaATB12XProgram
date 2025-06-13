package Ex_12_Functions;

public class Lab132_UD_Part1 {

    public static void main(String[] args) {

        ws_greet();
       String s= greet_with_hello_wp_with_RT();
        System.out.println(s);
        greet_with_details("Harika",25);
       int sum= sum_of_two_numbers(2,5);
        System.out.println(sum);

    }

    static void ws_greet(){
        System.out.println("hi,my name is harika!!");
    }

    static String greet_with_hello_wp_with_RT(){
        System.out.println("Hi");
        return "hi,who are you?";

    }

    static void greet_with_details(String name, int age){

        System.out.println("name->"+name+" age->"+age);
    }

    static int sum_of_two_numbers(int a,int b){
        return a+b;
    }


}
