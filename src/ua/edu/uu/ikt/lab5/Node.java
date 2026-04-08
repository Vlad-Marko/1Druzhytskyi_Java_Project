package ua.edu.uu.ikt.lab5;

public class Node {
    public Node(int data) {
        this.data = data;
    }

    private int data;

    private Node next;

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
