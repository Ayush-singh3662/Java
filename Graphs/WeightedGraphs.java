// package Graphs;

import java.util.ArrayList;

public class WeightedGraphs {
    static class Pair {
        int edge;
        int weight;
        Pair(int edge, int weight) {
            this.edge = edge;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0; i<=n; ++i) {
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(new Pair(2, 3));
        adj.get(2).add(new Pair(3, 4));
        adj.get(1).add(new Pair(3, 5));
        for(int i=0; i<adj.size(); ++i) {
            for(int j=0; j<adj.get(i).size(); ++j) {
                System.out.print(adj.get(i).get(j).edge+" ");
            }
            System.out.println();
        }
    }
}
