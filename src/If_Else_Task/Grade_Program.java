package If_Else_Task;

public class Grade_Program {
    public static void main(String[] args) {
        /* 90 - 100   A+
80 - 89     A
70 - 79      B
60 - 69     C
50 - 59      D
40 - 49      E
Below 40   Fail
       */
    int num=60;

    if(num>=90 && num<=100){
        System.out.println("A+");
    } else if (num>=80 && num<=89) {
        System.out.println("A");
    }
    else if (num>=70 && num<=79) {
        System.out.println("B");
    }
    else if (num>=60 && num<=69) {
        System.out.println("C");
    }
    else if (num>=50 && num<=59) {
        System.out.println("D");
    }
    else if (num>=40 && num<=49) {
        System.out.println("E");
    }
else{
        System.out.println("F");
    }
    }
}
