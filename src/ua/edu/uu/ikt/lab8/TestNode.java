package ua.edu.uu.ikt.lab8;

public class TestNode {

        static void main(String[] args) {
            Node root = new Node(20);
            Node left = new Node(10);
            Node right = new Node(30);
            root.setLeft(left);
            root.setRight(right);

            System.out.println("root Node: " + root.getData() );
            System.out.println("left Node: " + root.getLeft().getData() );
            System.out.println("rigth Node: " + root.getRight().getData() );
        }



    }
