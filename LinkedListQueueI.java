import java.util.LinkedList;

public class LinkedListQueueI {
    public static void main(String[] args) {
        LinkedList<Integer> que = new LinkedList<>();
        que.offer(1);
        que.offer(3);
        que.offer(8);
        que.offer(7);

        System.out.println(que);
        System.out.println(que.size());
        System.out.println(que.peek());
        System.out.println(que.poll());
        System.out.println(que.peek());
    }
}
