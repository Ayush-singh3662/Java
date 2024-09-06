// package Graphs;

import java.util.ArrayList;

public class Directed {
    public static void main(String[] args) {
        int n = 3, m= 3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<=n; ++i) {
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(1).add(3);
        for(int i=0; i<adj.size(); ++i) {
            for(int j=0; j<adj.get(i).size(); ++j) {
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
