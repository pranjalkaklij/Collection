import java.lang.Object;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CollectionIterator {
    public static void main(String[] args) {
        Object obj[]= new Object[4];
        obj[0]="Hello";
        obj[1]=1;
        obj[2]=true;
        obj[3]=2.4f;

        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }

        // Iterable is the parent interface of Collection which is present in java.lang package
        // @SuppressWarnings("unused") this annotation is for when i have created list or any collection and doesnt use them
        List<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(4);
        al.add(6);
        al.add(7);
        al.add(8);

        Iterator<Integer> i = al.iterator();

        // there are three methods in Iterable interface which is comonly used - they are hasNext(), next() and remove()
        
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        i.remove();
        System.out.println(i.hasNext());
        System.out.println(al);

        
    }
}
