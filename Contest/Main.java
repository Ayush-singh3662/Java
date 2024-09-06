/*
    Author : Ayush Kumar
*/

import java.util.TreeMap;

class Multiset {

    private TreeMap<Integer, Integer> treeMap;

    public Multiset() {
        treeMap = new TreeMap<>();
    }

    public void add(int element) {
        int count = treeMap.getOrDefault(element, 0);
        treeMap.put(element, count + 1);
    }

    public int count(int element) {
        return treeMap.getOrDefault(element, 0);
    }

    public void remove(int element) {
        int count = treeMap.getOrDefault(element, 0);
        if (count > 1) {
            treeMap.put(element, count - 1);
        } else {
            treeMap.remove(element);
        }
    }

    public boolean contains(int element) {
        return treeMap.containsKey(element);
    }

    public int size() {
        return treeMap.size();
    }

    public void clear() {
        treeMap.clear();
    }

    @Override
    public String toString() {
        return treeMap.toString();
    }
}

//Given for example to how to use this multiset class
/*
class Main {
    public static void main(String[] args ) {
	Multiset multiset = new Multiset();
	multiset.add(1);
	multiset.add(2);
	multiset.add(3);
	multiset.add(1);

	System.out.println(multiset.count(1)); // 2
	System.out.println(multiset.size()); // 4
    }
}

*/

public class Main {
    public static void main(String[] args) {
        Multiset x = new Multiset();
        Multiset y = new Multiset();
        int[][] points = {{3,10},{5,15},{10,2},{4,4}};
        // int n = po.length;
        for(int[] p : points) {
            x.add(p[0]-p[1]);
            y.add(p[0] + p[1]);  
        }
        int ans = (int) 1e9;
        for(int[] p : points) {
            x.remove(p[0]-p[1]);
            y.remove(p[0]+p[1]);
            // ans = Math.min(ans, Math.max(x.la))
        }
    }
}