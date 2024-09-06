package Heaps;
import java.util.Comparator;
import java.util.PriorityQueue;
public class Pq {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(2);
        pq.add(1);
        pq.add(5);
        pq.add(9);
        while(!pq.isEmpty()) {
            System.out.print(pq.remove()+" ");
        }
    }
}
