package Practice_Java;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_Element_Array {

    public static void main(String[] args) {

        int[] arr={2,3,4,2,3,4};

        Set<Integer> s=new HashSet<>();

        for(int n: arr){

            if(s.add(n)==false){
                System.out.print(n+ " ");
            }

        }


    }

}
