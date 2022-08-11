package BesantTech;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsExample {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(5);
        al.add('e');
        al.add(null);
        al.add("abc");
        al.remove(1);
       Iterator itr= al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}