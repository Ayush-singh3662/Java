import java.util.*;
import java.util.Queue;

public class Build_Tree {
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Build tree = new Build();
        Node root = tree.build(nodes);
        System.out.println(root.value);
        PreOrder t1 = new PreOrder();
        t1.preOrder(root);
        System.out.println();
        InOrder t2 = new InOrder();
        t2.inOrder(root);
        System.out.println();
        PostOrder t3 = new PostOrder();
        t3.postOrder(root);
        System.out.println();
        LevelOrder t4 =new LevelOrder();
        t4.levelOrder(root);
        System.out.println(numberOfNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(heightOfTree(root));
        System.out.println(diameterOfTree(root));
    }

    static class Node {
        int value;
        Node left;
        Node right;
        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    static class Build {
        static int idx = -1;
        public Node build(int[] nodes) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = build(nodes);
            newNode.right = build(nodes);
            return newNode;
        }
    }
    

    static class PreOrder {
        public void preOrder(Node root) {
            if(root == null) {
                return ;
            }
            System.out.print(root.value+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    static class InOrder {
        public void inOrder(Node root) {
            if(root == null) {
                return ;
            }
            inOrder(root.left);
            System.out.print(root.value +" ");
            inOrder(root.right);
        }
    }

    static class PostOrder {
        public void postOrder(Node root) {
            if(root == null) {
                return ;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.value+" ");
        }
    }

    static class LevelOrder {
        public void levelOrder(Node root) {
            if(root == null) {
                return ;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode == null) {
                    System.out.println();
                    if(!q.isEmpty()) {
                        q.add(null);
                    }
                    else {
                        break;
                    }
                }
                else {
                    System.out.print(currNode.value+" ");
                    if(currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if(currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    //count number of nodes in a tree
    static int numberOfNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int leftNodes = numberOfNodes(root.left);
        int rightNodes = numberOfNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

    //sum of nodes of a tree.
    static int sumOfNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.value;
    }

    //height of a tree
    static int heightOfTree(Node root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        int height = Math.max(leftHeight, rightHeight) + 1;
        return height;
    }

    //diameter of a tree
    static int diameterOfTree(Node root) {
        if(root == null) {
            return 0;
        }
        int leftDiameter = diameterOfTree(root.left);
        int rightDiameter = diameterOfTree(root.right);
        int rootDiameter = heightOfTree(root.left) + heightOfTree(root.right) + 1;
        return Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
    }
}
