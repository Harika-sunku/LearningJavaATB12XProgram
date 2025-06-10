package Ex_OOPs_Inheritance;

public class Employee extends Person {

    int employeeId  ;
    double salary;

    public Employee(String name, int age, double salary, int employeeId) {
        super(name, age);
        this.salary = salary;
        this.employeeId = employeeId;
    }

    void displayEmployeeDetails() {

        displayPersonDetails();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: ₹" + salary);
    }


}
