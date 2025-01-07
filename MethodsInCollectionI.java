import java.util.*;

public class MethodsInCollectionI {
    public static void main(String[] args) {
        List<Integer> al= new ArrayList<>();
        al.add(1);
        al.add(3);
        al.add(4);
        al.add(11);

        List<Integer> al2 = new ArrayList<>();
        al2.add(1); // will add element in array list
        al2.add(3);
        al2.add(11);
        System.out.println(al.size());  // will return size of array
        System.out.println(al.contains(3)); // will check that perticular element is present or not in collection
        System.out.println(al.remove(2)); // remove element on mentioned index from Collection
        System.out.println(al);
        System.out.println(al.equals(al2)); // will check that both collection object contains same or not
        al2.clear();
        System.out.println(al2);
    }
}
