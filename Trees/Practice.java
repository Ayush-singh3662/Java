// import java.util.*;
// import java.util.Queue;

// public class Practice {
//     public static void main(String[] args) {
//         int[] nodes = {8, 5, 3, 1, 4, 6, 10, 11, 14};
//         // Node root = build(nodes);
//         // System.out.println(root.value);
//         // preOrder(root);
//         // System.out.println();
//         // inOrder(root);
//         // System.out.println();
//         // postOrder(root);
//         // System.out.println();
//         // levelOrder(root);
//         // System.out.println(numberOfNodes(root));
//         // System.out.println(sumOfNodes(root));
//         // System.out.println(height(root));
//         // System.out.println(diameter(root));
//         Node root2 = null;
//         for(int x : nodes) {
//             root2 = buildBst(root2, x);
//         }
//         // System.out.println(root2.value);
//         inOrder(root2);
//         System.out.println();
//         System.out.println(search(root2, 90));
//         // delete(root2, 8);
//         inOrder(root2);
//         System.out.println();
//         range(root2, 5, 10);
//         System.out.println();
//         root2Leaf(root2, new ArrayList<>());
//     }

//     static class Node {
//         int value;
//         Node left;
//         Node right;
//         Node(int value) {
//             this.value = value;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static int idx = -1;
//     static Node build(int[] nodes) {
//         idx++;
//         if(idx == nodes.length) {
//             return null;
//         }
//         Node root = new Node(nodes[idx]);
//         root.left = build(nodes);
//         root.right = build(nodes);
//         return root;
//     }

//     static void preOrder(Node root) {
//         if(root == null) {
//             return ;
//         }
//         System.out.print(root.value+" ");
//         preOrder(root.left);
//         preOrder(root.right);
//     }

//     static void inOrder(Node root) {
//         if(root == null) {
//             return ;
//         }
//         inOrder(root.left);
//         System.out.print(root.value+" ");
//         inOrder(root.right);
//     }

//     static void postOrder(Node root) {
//         if(root == null) {
//             return ;
//         }
//         postOrder(root.left);
//         postOrder(root.right);
//         System.out.print(root.value+" ");
//     }

//     static void levelOrder(Node root) {
//     Queue<Node> q = new LinkedList<>();
//     q.add(root);
//     q.add(null);
//     while(!q.isEmpty()) {
//         Node currNode = q.remove();
//         if(currNode == null) {
//             System.out.println();
//             if(q.isEmpty()) {
//                 break;
//             }
//             else {
//                 q.add(null);
//             }
//         }
//         else {
//             System.out.print(currNode.val+" ");
//             if(currNode.left != null) {
//                 q.add(currNode.left);
//             }
//             if(currNode.right != null) {
//                 q.add(currNode.right);
//             }
//         }
//     }
// }

//     static int numberOfNodes(Node root) {
//         if(root == null) {
//             return 0;
//         }
//         int leftNumber = numberOfNodes(root.left);
//         int rightNumber = numberOfNodes(root.right);
//         return leftNumber + rightNumber + 1;
//     }

//     static int sumOfNodes(Node root) {
//         if(root == null) {
//             return 0;
//         }
//         int leftsum = sumOfNodes(root.left);
//         int rightSum = sumOfNodes(root.right);
//         return leftsum + rightSum + root.value;
//     }

//     static int height(Node root) {
//         if(root == null) {
//             return 0;
//         }
//         int leftHeight = height(root.left);
//         int rightHeight = height(root.right);
//         return Math.max(leftHeight, rightHeight) + 1;
//     }

//     static int diameter(Node root) {
//         if(root == null) {
//             return 0;
//         }
//         int dia1 = diameter(root.left);
//         int dia2 = diameter(root.right);
//         int dia3 = height(root.left) + height(root.right) + 1;
//         return Math.max(Math.max(dia1, dia2), dia3);
//     }

//     static Node buildBst(Node root, int value) {
//         if(root == null) {
//             root = new Node(value);
//             return root;
//         }
//         if(value < root.value) {
//             root.left = buildBst(root.left, value);
//         }
//         else {
//             root.right = buildBst(root.right, value);
//         }
//         return root;
//     }

//     static boolean search(Node root, int value) {
//         if(root == null) {
//             return false;
//         }
//         if(root.value < value) {
//             return search(root.right, value);
//         }
//         else if(root.value > value) {
//             return search(root.left, value);
//         }
//         return true;
//     }

//     static Node delete(Node root, int value) {
//         if(root == null) {
//             return null;
//         }
//         if(root.value < value) {
//             root.right = delete(root.right, value);
//         }
//         else if(root.value > value) {
//             root.left = delete(root.left, value);
//         }
//         else {
//             if(root.left == null && root.right == null) {
//                 return null;
//             }

//             if(root.left == null ) {
//                 return root.right;
//             }
//             if(root.right == null){
//                 return root.left;
//             }

//             Node temp = root;
//             root = root.right;
//             while(root.left != null) {
//                 root = root.left;
//             }
//             Node successor = root;
//             root = temp;
//             root.value = successor.value;
//             root.right = delete(root.right, successor.value);
//         }
//         return root;
//     }

//     static void range(Node root, int X, int Y) {
//         if(root == null) {
//             return ;
//         }
//         if(root.value >= X && root.value <= Y) {
//             range(root.left, X, Y);
//             System.out.print(root.value+" ");
//             range(root.right, X, Y);
//         }
//         else if(root.value < X) {
//             range(root.right, X, Y);
//         }
//         else {
//             range(root.left, X, Y);
//         }
//     }

//     static void root2Leaf(Node root, ArrayList<Integer> path) {
//         if(root == null) {
//             return ;
//         }
//         path.add(root.value);
//         if(root.right == null && root.left == null) {
//             for(int x : path) {
//                 System.out.print(x+"->");
//             }
//             System.out.println("null");
//         }
//         else {
//             root2Leaf(root.left, path);
//             root2Leaf(root.right, path);
//         }
//         path.remove(path.size()-1);
//     }
// }

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.HashMap;

public class Practice {
    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Build tree = new Build();
        Node root = tree.build(nodes);
        System.out.println(root.val);
        levelOrder1(root);
        System.out.println(height(root));
        System.out.println(count(root));
        System.out.println(diameter(root));
        Node subRoot = new Node(1);
        System.out.println(isSubtree(root, subRoot));
        topView(root);
        System.out.println();
        kthLevel(root, 2);
        System.out.println();
        System.out.println(lca(root, 2, 6).val);
        bottomView(root);
        System.out.println();
        System.out.println(lca2(root, 4, 6).val);
        System.out.println(minDistance(root, 4, 3));
        System.out.println(kthAncestor(root, 4, 1));
        transform(root);
        preOrder(root);
        System.out.println();
        Inf res = size(root);
        System.out.println(maxSize);
    }

    private static void preOrder(Node root) {
        if(root == null) {
            return ;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (root.val == subRoot.val) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null) {
            return true;
        }
        if (node == null || subRoot == null || node.val != subRoot.val) {
            return false;
        }
        // if(!isIdentical(node.left, subRoot.left)) {
        // return false;
        // }
        // if(!isIdentical(node.right, subRoot.right)) {
        // return false;
        // }
        // return true;
        return isIdentical(node.left, subRoot.left) && isIdentical(node.right, subRoot.right);
    }

    public static void levelOrder1(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                System.out.println();
                if (!q.isEmpty()) {
                    q.add(null);
                } else {
                    break;
                }
            } else {
                System.out.print(curr.val + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right) + 1;
    }

    static int count(Node root) {
        if (root == null) {
            return 0;
        }
        int left = count(root.left);
        int right = count(root.right);
        return left + right + 1;
    }

    static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int leftDiameter = diameter(root.left);
        int rightHeight = height(root.right);
        int rightDiameter = diameter(root.right);
        int selfDiameter = leftHeight + rightHeight + 1;

        return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
    }

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static class Build {
        static int idx = -1;

        public Node build(int[] nodes) {
            ++idx;
            if (nodes[idx] == -1) {
                return null;
            }
            Node node = new Node(nodes[idx]);
            node.left = build(nodes);
            node.right = build(nodes);
            return node;
        }
    }

    static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    private static void topView(Node root) {
        if (root == null) {
            return;
        }
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        q.add(new Info(root, 0));
        q.add(null);
        int max = 0, min = 0;
        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if(!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
                if(curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }
                if(curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }
        }
        for(int i=min; i<= max; ++i) {
            System.out.print(map.get(i).val+" ");
        }
    }

    // private static void topView(Node root) {
    //     if(root == null) {
    //         return ;
    //     }
    //     Queue<Info> q = new LinkedList<>();
    //     HashMap<Integer, Node> map = new HashMap<>();
    //     int min = 0, max = 0;
    //     q.add(new Info(root, 0));
    //     q.add(null);
    //     while(!q.isEmpty()) {
    //         Info curr = q.remove();
    //         if(curr == null) {
    //             if(q.isEmpty()) {
    //                 break;
    //             }
    //             else {
    //                 q.add(null);
    //             }
    //         } else {
    //             if(!map.containsKey(curr.hd)) {
    //                 map.put(curr.hd, curr.node);
    //             }
    //             if(curr.node.left != null) {
    //                 q.add(new Info(curr.node.left, curr.hd-1));
    //                 min = Math.min(min, curr.hd-1);
    //             }
    //             if(curr.node.right != null) {
    //                 q.add(new Info(curr.node.right, curr.hd+1));
    //                 max = Math.max(max, curr.hd+1);
    //             }
    //         }
    //     }
    //     for(int i=min; i<=max; ++i) {
    //         System.out.print(map.get(i).val+" ");
    //     }
    // }

    private static void kthLevel(Node root, int k) {
        helper(root, k, 1);
    }
    private static void helper(Node root, int k, int curr) {
        if(root == null) {
            return ;
        }
        if(curr == k) {
            System.out.print(root.val+" ");
            return ;
        }
        helper(root.left, k, curr+1);
        helper(root.right, k, curr+1);
    }

    private static Node lca(Node root, int n1, int n2) {
        if(root == null) {
            return null;
        }
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(root, n1, path1);
        getPath(root, n2, path2);
        int i=0;
        for(; i<path1.size() && i<path2.size(); ++i) {
            if(path1.get(i) != path2.get(i)) {
                break;
            }
        }
        return path1.get(i-1);
    }

    private static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if(root == null) {
            return false;
        }
        path.add(root);
        if(root.val == n) {
            return true;
        }
        boolean findLeft = getPath(root.left, n, path);
        boolean findRight = getPath(root.right, n, path);
        if(findLeft || findRight) {
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }

    private static void bottomView(Node root) {
        if(root == null) {
            return ;
        }
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int max = 0, min = 0;
        q.add(new Info(root, 0));
        q.add(null);
        while(!q.isEmpty()) {
            Info curr = q.remove();
            if(curr == null) {
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                map.put(curr.hd, curr.node);
                if(curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }
                if(curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }
        }
        for(int i=min; i<=max; ++i) {
            System.out.print(map.get(i).val+" ");
        }
    }

    private static Node lca2(Node root, int n1, int n2) {
        if(root == null || root.val == n1 || root.val == n2) {
            return root;
        }
        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);
        if(rightLca == null) {
            return leftLca;
        }
        if(leftLca == null) {
            return rightLca;
        }
        return root;
    }

    private static int minDistance(Node root, int n1, int n2) {
        if(root == null) {
            return -1;
        }
        Node lca = lca2(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);
        return dist1 + dist2;
    }

    private static int lcaDist(Node root, int n) {
        if(root == null) {
            return -1;
        }
        if(root.val == n) {
            return 0;
        }
        int left = lcaDist(root.left, n);
        int right = lcaDist(root.right, n);
        if(left == -1 && right == -1) {
            return -1;
        }
        else if(left == -1) {
            return right + 1;
        }
        return left + 1;
    }

    private static int kthAncestor(Node root, int n, int k) {
        if(root == null) {
            return -1;
        }
        if(root.val == n) {
            return 0;
        }
        int left = kthAncestor(root.left, n, k);
        int right = kthAncestor(root.right, n, k);
        if(left == -1 && right == -1) {
            return -1;
        }
        int max = Math.max(left, right);
        if(max + 1 == k) {
            System.out.println(root.val);
        }
        return max + 1;
    }

    private static int transform(Node root) {
        if(root == null) {
            return 0;
        }
        int left = transform(root.left);
        int right = transform(root.right);
        int data = root.val;
        int newLeft = root.left == null ? 0 : root.left.val;
        int newRight = root.right == null ? 0 : root.right.val;
        root.val = newLeft + left + newRight + right;
        return data;
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
            return new Inf(false, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
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