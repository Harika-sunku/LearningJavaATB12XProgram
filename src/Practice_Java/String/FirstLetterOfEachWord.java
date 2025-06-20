package Practice_Java.String;

public class FirstLetterOfEachWord {
    public static void main(String[] args) {

        String str="Harika is my name";

        for (String word : str.split("\\s+")) {
            System.out.print(word.charAt(0));
        }




    }
}
