package Practice_Java.String;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {

        String s=" Geeks for Geeks ";
        s=s.replaceAll("\\s","");
        System.out.println("String without spaces: '" + s + "'");


    }
}
