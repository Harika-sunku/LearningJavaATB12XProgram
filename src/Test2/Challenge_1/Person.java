package Test2.Challenge_1;

public class Person {

    String name;
    int age;

    public Person(String name,int age) {
        this.name = name;
        this.age=age;
    }

    void display(){
        System.out.println("Name: " + name + ", Age: " + age);
    }

}
