package Ex_05_Terenary_Operator;

public class Lab075_Interview_Ready_Question {

    public static void main(String[] args) {

        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
      int number=21;
      String s=(number>18)?(number>25? "In Goa, You can drink" : "You can't Drink"):"You can't go to goa";

        System.out.println(s);

    }

}
