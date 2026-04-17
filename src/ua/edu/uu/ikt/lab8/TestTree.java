package ua.edu.uu.ikt.lab8;

public class TestTree {

     static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(35);
        tree.insert(24);
        tree.insert(15);
        tree.insert(50);
        tree.insert(45);
        tree.insert(44);

        tree.displayTree();
        System.out.println("Depth of the tree is: " + tree.getDepth());
        System.out.println("Min node is: " + tree.findMinNode());
        System.out.println("Max node is: " + tree.findMaxNode());
        System.out.println("Min node is: " + tree.findMinNode().getData());
        System.out.println("Max node is: " + tree.findMaxNode().getData());
    }
}
