package EX_OOPs_Constructor;

public class Mobile {
    String brand;
    double price;
    Mobile(String brand){
    this.brand=brand;
        System.out.println("Mobile Brand: " + brand);
    }
    Mobile(String brand,double price){
        this.brand=brand;
        this.price=price;
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Mobile Price: ₹" + price);
    }
/*
    void displayDetails() {
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Mobile Price: ₹" + price);
    }

 */

    public static void main(String[] args) {
        Mobile m1=new Mobile("Samsung");
        Mobile m2=new Mobile("One Plus",50000.00);



    }

}
