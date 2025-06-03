package Ex_01_JavaBasics;

public class Lab014_StringFirstLetter {
    public static void main(String[] args) {
        String a="Java programming 1234 practice!!";
        boolean inword=false;
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(Character.isLetterOrDigit(ch)) {
                if(!inword){
                    System.out.print(ch);
                    inword=true;

                }
            }
            else{
                inword=false;
            }

        }

    }

}
