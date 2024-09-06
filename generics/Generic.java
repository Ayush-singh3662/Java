package generics;

import java.util.ArrayList;
import java.util.List;

public class Generic {
    Object[] s = new Object[3];
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Generic obj = new Generic();
        // obj.data[0] = "hii";
        // obj.data[1] = "bye";
        // obj.data[2] = "Ayush";
        obj.s[0] = "Ayush";
        obj.s[1] = 10;
        obj.s[2] = true;
        for(int i=0; i<3; ++i) {
            System.out.println(obj.s[i]);
        }

        Temp<String> g = new Temp<>();
        g.setData("Hii");
        String s = g.getData();
        System.out.println(s);

        Array<String> arr = new Array<>();
        arr.append("hii");
        arr.display();

        // K<String> k = new K<>();
        // k.arr[0] = "a";
        // k.arr[1] = "b";
        // k.arr[2] = "c";
        // for(int i=0; i<3;++i) {
        //     System.out.println(k.arr[i]);
        // }        

        // My<Character> m = new My<>();  //not allowed
        My<A> m1 = new My<>();
        My<B> m2 = new My<>();
        My<C> m3 = new My<>();

        Multiple<Integer, String> mul = new Multiple<>();
        mul.add(1, "Ayush");

        // Sub<String> s1 = new Sub<>();
        // s1.arr[0] = "1";
        // s1.arr[1] = "c";

        Generic x = new Generic();
        x.show(new String[]{"hii", "bye", "go"});
        x.show2("hii", "bye", "go");
        List<Integer> l1 = new ArrayList<>();
        List<Number> l2 = new ArrayList<>();
        List<Object> l3 = new ArrayList<>();
        List<Character> l4 = new ArrayList<>();
        x.add(l1);
        x.add(l2);
        x.add(l3);
        // x.add(l4);
    }

    <T> void show(T[] list) {
        for(T x : list) {
            System.out.println(x);
        }
    }

    @SuppressWarnings("unchecked")
    <T> void show2(T... list) {
        for(T x : list) {
            System.out.println(x);
        }
    }


    //super is used for lower bound and extends used for upper bound
    public void add(List<? super Integer> list) {
        for(int i=0; i<5; ++i) {
            list.add(i+1);
        }
    }
}

class Temp<T> {
    T obj;

    protected void setData(T obj) {
        this.obj = obj;
    }

    protected T getData() {
        return obj;
    }
}

@SuppressWarnings("unchecked")
class Array<T> {
    T[] arr = (T[])new Object[3];

    int len = 0;

    public void append(T a) {
        arr[len++] = a;
    }

    public int length() {
        return len;
    }

    public void display() {
        for(int i=0; i<len; ++i) {
            System.out.println(arr[i]);
        }
    }
}


@SuppressWarnings("unchecked")
class K<T> {
    T[] arr = (T[]) new Object[3];
}

class A {

}

class B extends A {

}

class C extends A {

}

class My<T extends A> {

}

@SuppressWarnings("hiding")
class Multiple<K, V> {
    public void add(K x, V y) {

    }
}

@SuppressWarnings("unchecked")
class Super<T> {
    T[] arr = (T[]) new Object[3];
}

@SuppressWarnings("unchecked")
class Sub<T> extends Super<T> {
    T[] arr = (T[]) new Object[3];
}