package Ex_17_Collection_Framework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ex_ListIterator {

    public static void main(String[] args) {

        List l=new ArrayList();

        l.add("Harika");
        l.add(50);
        l.add("Akshay");
        l.add('H');

        ListIterator li=l.listIterator();
        li.next();
        li.next();
        li.next();

        while(li.hasPrevious()){
            System.out.println(li.previous());
        }


    }
}
