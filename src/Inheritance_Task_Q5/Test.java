package Inheritance_Task_Q5;

public class Test {
    public static void main(String[] args) {

        Shape s1 = new Shape();
        s1.area();  // Output: Calculating area of a shape

        Shape s2 = new Circle();
        s2.area();  // Output: Area of Circle = π × r × r

        Shape s3 = new Rectangle();
        s3.area();  // Output: Area of Rectangle = length × breadth

    }
}
