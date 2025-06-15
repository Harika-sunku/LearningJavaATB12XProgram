package Ex_14_StringBuffer_Builder_StringFunctions;

public class Lab143_String_Functions {

    public static void main(String[] args) {

        String name = "Akshay";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        //System.out.println(name.charAt(8));

        //concat
        System.out.println(name.concat(" Sunku"));

        // 3. contains()
        System.out.println(name.contains("ha"));

        // 4. equals()
        System.out.println(name.equals("akshay"));

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("akshay"));

        // 6. indexOf() //  sonal -> ? o
        System.out.println(name.indexOf('s'));

        // 7. length()
        System.out.println(name.length());

        //replace
        System.out.println(name.replace('a','h'));

        // 10. substring( , )
        System.out.println(name.substring(1, 3));

        // 11. toLowerCase()
        System.out.println("SONAL".toLowerCase());

        // 12. toUpperCase()
        System.out.println("sonal".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("A"));

        // 15. endsWith()
        System.out.println(name.endsWith("h"));

        // 16. trim()
        String name3 = "    Sonal Harish     ";
        System.out.println(name3.trim());

        // 17. compareTo()
        System.out.println(name.compareTo("Akshay"));

        StringBuilder stringBuilder = new StringBuilder("Akshith");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());

        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);


    }
}
