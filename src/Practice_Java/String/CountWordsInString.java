package Practice_Java.String;

public class CountWordsInString {
    public static void main(String[] args) {

        String str = "Hello world! Welcome to Java.";
        String[] words=str.split("\\s");
        System.out.println(words.length);



    }
}
