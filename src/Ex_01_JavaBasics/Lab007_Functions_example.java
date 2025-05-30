package Ex_01_JavaBasics;

import java.util.Scanner;

public class Lab007_Functions_example {

    public static void main(String[] args) {

        //1
        greet();

        //2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        personal_information(name,age);

        //3

        String w=greetings();
        System.out.println(w);

        //4
        System.out.print("Enter value1: ");
        int value1 = scanner.nextInt();
        System.out.print("Enter value2: ");
        int value2 = scanner.nextInt();
       int sum= add(value1,value2);
        System.out.print(sum);
    }

    //4 types of functions
    //1.without parameters and without return type

    static void greet(){
        System.out.println("Hi,My name is Harika.");
    }


    //2.with parameters and without return type

    static void personal_information(String name,int age){
        System.out.println("Name->"+name+" "+"age->"+age);
    }


    //3.without parameters and with return type

    static String greetings(){
        System.out.println("So Happy for you");
        return "Congratulations";
    }



    //4.with parameters and with return type

    static int add(int a, int b){
        return a+b;
    }




}
