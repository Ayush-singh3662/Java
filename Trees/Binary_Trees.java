import java.util.Scanner;

public class Binary_Trees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        bt.insert(sc);
        // bt.display();
        bt.prettyDisplay();
    }
}

class BinaryTree {
    private static class Node {
        int value;
        Node left;
        Node right;
        Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void insert(Scanner sc) {
        System.out.println("Enter the value of root node: ");
        int value = sc.nextInt();
        root = new Node(value);
        insert(sc, root);
    }

    //insert elements
    private void insert(Scanner sc, Node node) {
        System.out.println("Do you want to insert the left node of "+node.value+": ");
        boolean left = sc.nextBoolean();
        if(left) {
            System.out.println("Enter the value of left node of "+node.value+": ");
            int val = sc.nextInt();
            node.left = new Node(val);
            insert(sc, node.left);
        }
        System.out.println("Do you want to enter the right node of "+node.value+": ");
        boolean right  = sc.nextBoolean();
        if(right) {
            System.out.println("Enter the value of right node of "+node.value+": ");
            int val = sc.nextInt();
            node.right = new Node(val);
            insert(sc, node.right);
        }
    }

    //display elements
    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if(node == null) {
            return ;
        }
        System.out.println(indent+node.value);
        display(node.left, indent+"\t");
        display(node.right, indent+"\t");
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if(node == null) {
            return ;
        }
        prettyDisplay(node.right, level+1);
        if(level != 0) {
            for(int i=0; i<level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>"+node.value);
        }
        else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level+1);
    }
}