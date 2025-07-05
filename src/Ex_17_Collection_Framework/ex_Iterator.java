package Ex_17_Collection_Framework;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ex_Iterator {
    public static void main(String[] args) {

        List l=new ArrayList();

        l.add("Harika");
        l.add(50);
        l.add("Akshay");
        l.add('H');

        System.out.println(l);

        Iterator li =l.iterator();

        while(li.hasNext()){
            System.out.println(li.next());

        }
        li.remove();
        System.out.println(l);
    }
}
