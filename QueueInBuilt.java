import java.util.Queue;
import java.util.*;

public class QueueInBuilt {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(56);
        queue.add(57);
        queue.add(34);
        queue.add(60);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.peek());
    }
}
