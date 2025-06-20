package Practice_Java.String;

public class RemoveLeadingZeros {
    public static void main(String[] args) {
        String str = "00012345000";
        str = str.replaceFirst("^0+(?!$)", "");

        System.out.println("String without leading zeros: '" + str + "'");//output--12345000




    }
}
