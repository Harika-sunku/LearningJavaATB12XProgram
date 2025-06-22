package Test2.Challenge_2;

public class Student {
     String name;
       int rollNo;
        char section;

    public Student(String name, int rollNo, char section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    void display(){
        System.out.println("Name: " + name + ", rollNo: " + rollNo+ ", section: "+section);
    }
}
