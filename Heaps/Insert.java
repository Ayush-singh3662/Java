package Heaps;

import java.util.ArrayList;

public class Insert {

    static class Heaps {
        ArrayList<Integer> list = new ArrayList<>();
        public void add(int val) {
            list.add(val);
            int x = list.size() - 1;
            int par = (x - 1) / 2;
            while(list.get(x) < list.get(par)) {
                int temp = list.get(x);
                list.set(x, list.get(par));
                list.set(par, temp);
                x = par;
                par = (x - 1) / 2;
            }
        }

        public int peek() {
            return list.get(0);
        }

        public int remove() {
            int temp = list.get(0);
            list.set(0, list.get(list.size() - 1));
            list.set(list.size()-1, temp);
            list.remove(list.size() - 1);
            heapify(0);
            return temp;
        }

        private void heapify(int i) {
            int min = i;
            int left = 2*i+1;
            int right = 2*i+2;
            if(left < list.size() && list.get(left) < list.get(min)) {
                min = left;
            }
            if(right < list.size() && list.get(right) < list.get(min)) {
                min = right;
            }
            if(min != i) {
                int temp = list.get(i);
                list.set(i, list.get(min));
                list.set(min, temp);
                heapify(min);
            }
        }

        public boolean isEmpty() {
            return list.size() == 0;
        }
        public void display() {
            for(int i=0; i<list.size(); ++i) {
                System.out.print(list.get(i) + " ");
            }
        }
    }
    public static void main(String[] args) {
        Heaps h = new Heaps();
        h.add(2);
        h.add(1);
        h.add(10);
        h.add(4);
        h.add(11);
        h.add(3);
        while(!h.isEmpty()) {
            System.out.print(h.remove() + " ");
        }
    }
}
