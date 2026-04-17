package ua.edu.uu.ikt.lab8;

public class Node {

    public Node(int data) {
        this.data = data;
    }


    private int data;
    private Node left;
    private Node right;


    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
