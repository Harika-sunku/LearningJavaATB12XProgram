package EX_JavaPrograms_Task;

public class String_NoOfWords {
    public static void main(String[] args) {
        String n="This is java  String Practice program for counting number of words.  ";
        int wordCount = 0;
        boolean inWord = false;
       String m= n.trim();
        System.out.println(m);
        int ln=n.length();
        for(int i=0;i<ln;i++){
            char c = n.charAt(i);
            if(c!=' ' && !inWord){
                wordCount++;
                inWord = true;

            }
            else if (c == ' ') {
                inWord = false;
            }
            }
        System.out.println("Number of words: " + wordCount);
    }

}
