import java.util.ArrayList;

// Arraylist extends AbstractList Class and Implements List<E>, RandomAccess, Cloneable, java.io.Serializable Interface
public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Integer> arrl = new ArrayList<>();
        arrl.add(2);
        arrl.add(4);
        arrl.add(3);
        arrl.add(5);
        arrl.add(7);
        // The add method will add the element 
        System.out.println(arrl);
        System.out.println(arrl.get(1)); // 0-based indexing
        arrl.set(2, 45); //modifing the elemets in list
        System.out.println(arrl);
        System.out.println(arrl.contains(7)); // it will check the element is present or not
        int a = arrl.lastIndexOf(45); //return the index of the last occurance of the element
        System.out.println(a);


    }
    
}
