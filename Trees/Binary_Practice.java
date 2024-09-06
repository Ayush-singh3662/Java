public class Binary_Practice {
    public static void main(String[] args) {
        int[] values = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for(int val : values) {
            root = build(root, val);
        }
        inOrder(root);
        System.out.println();
        System.out.println(search(root, 12));
        delete(root, 14);
        inOrder(root);
        System.out.println();
        // mirror(root);
        inOrder(root);
        System.out.println();
        Inf res = size(root);
        System.out.println(maxSize);
    }

    static class Node {
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
        }
    }

    private static Node build(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }
        if(val < root.val) {
            root.left = build(root.left, val);
        } else if(val > root.val) {
            root.right = build(root.right, val);
        }
        return root;
    }

    private static void inOrder(Node root) {
        if(root == null) {
            return ;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

    private static boolean search(Node root, int val) {
        if(root == null) {
            return false;
        }
        if(root .val == val) {
            return true;
        }
        return search(root.left, val) || search(root.right, val);
    }

    private static Node delete(Node root, int val) {
        if(root.val > val) {
            root.left = delete(root.left, val);
        } else if(root.val < val) {
            root.right = delete(root.right, val);
        } else {
            if(root.left == null && root.right == null) {
                return null;
            }
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;
            Node temp = successor(root.right);
            root.val = temp.val;
            root.right = delete(root.right, root.val);
        }
        return root;
    }

    private static Node successor(Node root) {
        if(root.left != null) root = root.left;
        return root;
    }

    private static Node mirror(Node root) {
        if(root == null) {
            return null;
        }
        Node left = mirror(root.left);
        Node right = mirror(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    static class Inf {
        boolean isBst;
        int size;
        int min;
        int max;
        Inf(boolean isBst, int size, int min, int max) {
            this.isBst = isBst;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    private static int maxSize = 0;

    private static Inf size(Node root) {
        if(root == null) {
            return new Inf(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Inf left = size(root.left);
        Inf right = size(root.right);
        int size = left.size + right.size + 1;
        int min = Math.min(root.val, Math.min(left.min, right.min));
        int max = Math.max(root.val, Math.max(left.max, right.max));
        if(left.max >= root.val || right.min <= root.val) {
            return new Inf(false, size, min, max);
        }
        if(left.isBst && right.isBst) {
            maxSize = Math.max(maxSize, size);
            return new Inf(true, size, min, max);
        }
        return new Inf(false, size, min, max);
    }
}
