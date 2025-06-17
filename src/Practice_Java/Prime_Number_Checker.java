package Practice_Java;

public class Prime_Number_Checker {

    public static void main(String[] args) {

        int n=13;
        boolean isprime=true;

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime=false;
            }
        }
        if(isprime){
            System.out.println("Given number is prime");
        }
        else{
            System.out.println("Given number is not prime number");
        }


    }
}
