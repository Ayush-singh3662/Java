package Heaps;

import java.util.PriorityQueue;

public class WeakestSoldier {
    public static void main(String[] args) {
        int[][] mat = {{1, 0, 0, 0},
                    {1, 1, 1, 1},
                    {0, 1, 0, 0},
                    {0, 0, 0, 1}};
        int k = 2;
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for(int i=0; i<mat.length; ++i) {
            int count = 0;
            for(int j=0; j<mat[0].length; ++j) {
                if(mat[i][j] == 1) {
                    count++;
                }
            }
            pq.add(new Row(i, count));
        }
        for(int i=0; i<k; ++i) {
            System.out.println("R"+pq.remove().idx);
        }
    }

    static class Row implements Comparable<Row> {
        int idx;
        int sol;
        Row(int idx, int sol) {
            this.idx = idx;
            this.sol = sol;
        }
        @Override
        public int compareTo(Row r) {
            if(this.sol == r.sol) {
                return this.idx - r.idx;
            }
            return this.sol - r.sol;
        }
    }
}
