package EX_JavaPrograms_Task;

public class String_NoOfWords_replaceall {
    public static void main(String[] args) {
        //String ln="  My name is Harika.   ";
        //String ln=" ";
        String ln="Hello World. ";
        String cleaned= ln.trim().replaceAll("//s+"," ");
        System.out.println(cleaned);
        int a=cleaned.isEmpty()?0:cleaned.split(" ").length;
        System.out.println(a);








    }


}
