import java.util.*;

public class DequeInBuilt {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(5);
        deque.addFirst(3);
        deque.addFirst(2);
        deque.addLast(6);
        deque.removeLast();
        deque.removeFirst();
        System.out.println(deque);
    }
}
