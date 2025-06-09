package EX_OOPs_Constructor;

public class Rectangle {

    int length;
    int breadth;

    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    void area(){
        int area=length*breadth;
        System.out.println("Area of rectangle: "+ area);

    }

    public static void main(String[] args) {
        Rectangle stu=new Rectangle(10,4);
        Rectangle stu1=new Rectangle(11,4);
        stu.area();
        stu1.area();
    }


}
