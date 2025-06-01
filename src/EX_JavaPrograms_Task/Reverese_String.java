package EX_JavaPrograms_Task;

public class Reverese_String {

    public static void main(String[] args) {
        String word = "Akshith";
        String rev = "";
        int len = word.length();
        for (int i = len - 1; i >= 0; i--) {
         rev=rev+word.charAt(i);
        }
        System.out.println(rev);
    }
}
