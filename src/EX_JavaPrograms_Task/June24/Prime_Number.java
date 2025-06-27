package EX_JavaPrograms_Task.June24;

public class Prime_Number {
    public static void main(String[] args) {

        int n=5;
        boolean isprime=true;

        for(int i=2;i<n/2;i++){
            if(n%i==0){
                isprime=false;
            }

        }

        if(isprime){
            System.out.println("Given number is prime number");
        }
        else{
            System.out.println("Given number is not prime number");
        }





    }
}
