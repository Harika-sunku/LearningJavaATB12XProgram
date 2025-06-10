package Ex_OOPs_MethodOverriding;

public class test {

    public static void main(String[] args) {

        Animal myDog = new Dog();
        myDog.makeSound();

        Animal myCat = new Cat();
        myCat.makeSound();

        Animal genericAnimal = new Animal();
        genericAnimal.makeSound();

    }

}
