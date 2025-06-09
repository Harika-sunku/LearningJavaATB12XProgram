package EX_OOPs_Constructor;

public class Car {
    String brand;
    String model;
    double price;


    Car(String brand, String model, double price){
     this.brand=brand;
     this.model=model;
     this.price=price;
    }

    public static void main(String[] args) {
        Car car1=new Car("Hyundai", "Creta", 1000000.00);

        System.out.println("Brand: " + car1.brand);
        System.out.println("Model: " + car1.model);
        System.out.println("Price: " + car1.price);

    }


}
