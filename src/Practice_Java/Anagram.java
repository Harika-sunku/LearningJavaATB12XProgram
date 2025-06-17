package Practice_Java;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(anagram("Silent","Listen"));
        System.out.println(anagram("CAT","act"));
        System.out.println(anagram("Silent","Listten"));
        System.out.println(anagram("Silent","L123isten"));


    }

    public static boolean anagram(String s1,String s2){

        s1=s1.replaceAll("[^a-zA-Z]","");
        s2=s2.replaceAll("[^a-zA-Z]","");

        if(s1.length()!=s2.length()){
            return false;
        }
        else{
         char[] c1= s1.toLowerCase().toCharArray();
            char[] c2= s2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);

            return Arrays.equals(c1,c2);

        }



    }
}
