package Inheritance_Task_Q6;

public class Employee extends Person{

    void displayInfo() {
        System.out.println("Employee: Specific Information");
    }

    void showDetails() {
        System.out.println("Calling both methods:");
        super.displayInfo(); // Call parent class method
        displayInfo();       // Call child class method
    }
}
