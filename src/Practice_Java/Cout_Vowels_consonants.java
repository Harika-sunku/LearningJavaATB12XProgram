package Practice_Java;

public class Cout_Vowels_consonants {
    public static void main(String[] args) {

        String s="Har6i9ka";
        //String u=s.toUpperCase();
        int len=s.length();
        int vowels=0,consonants=0,digit=0;

        for(int i=0;i<len;i++){

            char ch=s.charAt(i);

            if(Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                    vowels++;
                } else if (ch >= 'a' && ch <= 'z') {
                    consonants++;
                }
            }

            if(Character.isDigit(ch)){
                digit++;
            }

        }

        System.out.println("Vowels-> "+vowels+" consonants-> "+consonants+" didgit-> "+digit);

        }

    }

