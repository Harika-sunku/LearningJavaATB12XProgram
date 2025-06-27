package Practice_Java;

public class Duplicate_String {

    public static void main(String[] args) {

        String s="Madam";
        s=s.toLowerCase();//madam
        String result="";
        for(int i=0;i<s.length();i++){
            String s1=""+s.charAt(i);

            if(result.contains(s1)){
                continue;
            }
            result+=s1;
        }
        System.out.println(result);

    }
}
