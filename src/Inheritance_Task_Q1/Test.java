package Inheritance_Task_Q1;

public class Test {
    public static void main(String[] args) {

        Dog d=new Dog();
        d.sound();   // Output: Dog sounds bow! bow!
        Animal myAnimal = new Animal();
        myAnimal.sound();  // Output: Animal makes a sound
        //  polymorphism
        Animal ref = new Dog();
        ref.sound();       // Output: Dog sounds bow! bow! (due to method overriding)

    }

}
