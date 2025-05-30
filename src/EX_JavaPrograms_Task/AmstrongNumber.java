package EX_JavaPrograms_Task;

public class AmstrongNumber {
    public static void main(String[] args) {
       int  num=121,orignalnum, remainder, result = 0;
        orignalnum = num;
        while(orignalnum !=0){
            remainder = orignalnum % 10;
            result += Math.pow(remainder, 3);
            orignalnum /= 10;
        }
        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
