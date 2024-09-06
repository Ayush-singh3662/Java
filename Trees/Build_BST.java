import java.util.ArrayList;

public class Build_BST {
    public static void main(String[] args) {
        int[] values = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for(int i=0; i<values.length; ++i) {
            root = build(root, values[i]);
        }
        System.out.println(root.value);
        inOrder(root);
        System.out.println();
        // System.out.println(search(root, 8));
        // delete(root, 3);
        // inOrder(root);
        // System.out.println();
        printInRange(root, 6, 10);
        System.out.println();
        ArrayList<Integer> path = new ArrayList<>();
        root2Leaf(root, path);
    }

    static class Node {
        int value;
        Node left;
        Node right;
        Node(int value) {
            this.value = value;
        }
    }

    static Node build(Node root, int value) {
        if(root == null) {
            root = new Node(value);
            return root;
        }

        if(root.value > value) {
            root.left = build(root.left, value);
        }
        else {
            root.right = build(root.right, value);
        }
        return root;
    }

    static void inOrder(Node root) {
        if(root == null) {
            return ;
        }
        inOrder(root.left);
        System.out.print(root.value+" ");
        inOrder(root.right);
    }

    static boolean search(Node root, int target) {
        if(root == null) {
            return false;
        }
        if(root.value == target) {
            return true;
        }
        else if(root.value > target) {
            return search(root.left, target);
        }
        else {
            return search(root.right, target);
        }
    }

    static Node delete(Node root, int value) {
        if(root.value < value) {
            root.right = delete(root.right, value);
        }
        else if(root.value > value) {
            root.left = delete(root.left, value);
        }
        else {
            //case 1
            if(root.left == null && root.right == null) {
                return null;
            }
            
            //case 2
            if(root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }

            //case 3
            Node temp = successor(root.right);
            root.value = temp.value;
            root.right = delete(root.right, temp.value);
        }
        return root;
    }

    static Node successor(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    static void printInRange(Node root, int X, int Y) {
        if(root == null) {
            return ;
        }

        if(root.value >= X && root.value <= Y) {
            printInRange(root.left, X, Y);
            System.out.print(root.value+" ");
            printInRange(root.right, X, Y);
        }
        else if(root.value < X) {
            printInRange(root.right, X, Y);
        }
        else {
            printInRange(root.left, X, Y);
        }
    }

    static void root2Leaf(Node root, ArrayList<Integer> path) {
        if(root == null) {
            return ;
        }
        path.add(root.value);
        if(root.left == null && root.right == null) {
            for(int i=0; i<path.size(); ++i) {
                System.out.print(path.get(i)+"->");
            }
            System.out.println("null");
        }
        else {
            root2Leaf(root.left, path);
            root2Leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }
}