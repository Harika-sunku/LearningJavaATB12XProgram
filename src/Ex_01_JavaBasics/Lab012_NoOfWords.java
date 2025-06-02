package Ex_01_JavaBasics;

public class Lab012_NoOfWords {
    public static void main(String[] args) {
        String a="Java programming 1234 practice!!";
        int count=0;
        boolean inword=false;
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
           if(Character.isLetterOrDigit(ch)) {
               if(!inword){
                   count++;
                   inword=true;

               }
           }
           else{
               inword=false;
           }



        }


        System.out.println(count);



    }




}
