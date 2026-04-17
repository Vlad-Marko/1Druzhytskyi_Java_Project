package ua.edu.uu.ikt.lab8;
import java.util.Stack;


public class Tree {

    private Node root;
    private Integer levels;

    public Node findMinNode() {
        Node current = root;
        Node result = null;
        while (current != null) {
            result = current;
            current = current.getLeft();
        }

        return result;
    }

    public Node findMaxNode() {

        Node current = root;
        Node result = null;
        while (current != null) {
            result = current;
            current = current.getRight();
        }

        return result;
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (root == null)
            root = newNode;
        else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (data < current.getData()) {
                    current = current.getLeft();
                    if (current == null) {
                        parent.setLeft(newNode);
                        return;
                    }
                } else {
                    current = current.getRight();
                    if (current == null) {
                        parent.setRight(newNode);
                        return;
                    }
                }
            }
        }
    }

    public void displayTree() {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println(
                "..........................................................................");
        while (isRowEmpty == false) {
            Stack localStack = new Stack();
            isRowEmpty = true;
            for (int j = 0; j < nBlanks; j++)
                System.out.print(' ');
            while (globalStack.isEmpty() == false) {
                Node temp = (Node) globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.getData());
                    localStack.push(temp.getLeft());
                    localStack.push(temp.getRight());
                    if (temp.getLeft() != null ||
                            temp.getRight() != null)
                        isRowEmpty = false;
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < nBlanks * 2 - 2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            nBlanks /= 2;
            while (localStack.isEmpty() == false)
                globalStack.push(localStack.pop());
        }
        System.out.println(
                "..........................................................................");
    }

    public int getDepth() {
        levels = 0;
        if (root != null) {
            levels++;
            findDepth(root, levels);
        }
        return levels;
    }

    private void findDepth(Node node, Integer depth) {
        if (levels < depth) {
            levels++;
        }

        if (node.getLeft() != null) {
            findDepth(node.getLeft(), depth + 1);
        }
        if (node.getRight() != null) {
            findDepth(node.getRight(), depth + 1);
        }
    }

}
