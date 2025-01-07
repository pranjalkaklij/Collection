import java.util.*;

public class CollectionsUtilClass {
    
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("Dmitri");
        al.add("Inna");
        al.add("Radion");
        al.add("Alessia");

        System.out.println("before using any operation : "+al);
        // now we are using Collections class methods.
        System.out.println("after performing operations. ");
        Collections.addAll(al, "Ronan","Ivy");
        System.out.println(al);
        Collections.sort(al);
        System.out.println("After Sorting : "+al);
    }
}
