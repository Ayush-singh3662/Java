package Heaps;

// import java.util.Comparator;
import java.util.PriorityQueue;

public class PqObjects {
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 5));
        pq.add(new Student("B", 9));
        pq.add(new Student("C", 1));
        while(!pq.isEmpty()) {
            System.out.print(pq.peek().name+" -> "+pq.peek().rank);
            pq.remove();
            System.out.println();
        }
    }

    static class Student implements Comparable<Student> {
        String name;
        int rank;
        Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s) {
            return this.rank - s.rank;
        }
    }
}
