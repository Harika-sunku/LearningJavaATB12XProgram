package Practice_Java;

public class Triangle_Classifier {
    public static void main(String[] args) {

        int a=4,b=3,c=3;

        if(a==b && b==c){
            System.out.println("Equilateral triangle");
        } else if (a==b || b==c || c==a) {
            System.out.println("isosceles triangle");
        }
        else{
            System.out.println("scalene triangle");
        }

    }
}
