package Ex_OOPs_Inheritance;

public class Person {

    String name;
    int age;

    public Person(String name,int age) {
        this.name = name;
        this.age=age;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
