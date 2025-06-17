package Practice_Java;

public class Reverse_Words_inasentence {

    public static void main(String[] args) {
        String s="My Name Is Harika";
        String rev="";
       String[] word= s.split(" ");
       for(int i=0;i<word.length;i++){
           for(int j=word[i].length()-1;j>=0;j--){
               rev=rev+word[i].charAt(j);
           }
           rev=rev+" ";
       }
        System.out.println(rev);

    }
}
