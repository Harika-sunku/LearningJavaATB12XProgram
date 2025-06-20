package If_Else_Task;

public class Min_three_numbers {
    public static void main(String[] args) {


        int a=3,b=30,c=7;

        if(a<=b && a<=c){
            System.out.println("Largest of three numbers is "+a);
        }
        else if(b<=a && b<=c){
            System.out.println("Largest of three numbers is "+b);
        }
        else {
            System.out.println("Largest of three numbers is " + c);


        }


    }
}
