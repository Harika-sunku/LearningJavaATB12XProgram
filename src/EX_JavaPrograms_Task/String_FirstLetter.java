package EX_JavaPrograms_Task;

public class String_FirstLetter {
    public static void main(String[] args) {
        String line="  Extract First Letter Of Each Word.  ";//EFLOEW
        String cleaned=line.trim();

        System.out.println(cleaned);//Extract First Letter Of Each Word.

        char[] arr=cleaned.toCharArray();

        if(arr.length>0 && arr[0]!=' '){
            System.out.print(arr[0]);

        }
        for(int i=1;i<arr.length;i++){
            if (arr[i - 1] == ' ' && arr[i] != ' ') {
                System.out.print(arr[i]);
            }

            }


        }


    }



