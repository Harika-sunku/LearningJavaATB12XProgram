package EX_OOPs_Constructor;

public class Student {

    String name;
    int age;
    Student(String name,int age) {
        this.name = name;
        this.age = age;

    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Student student=new Student("Akshith",12);
        student.display();


    }




}
