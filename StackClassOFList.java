import java.util.Stack;

public class StackClassOFList {

    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("brave");
        st.push("emo");
        st.push("wild");
        st.push("active");

        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.search("wild"));


    }
    
}
