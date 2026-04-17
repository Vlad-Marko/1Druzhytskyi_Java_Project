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


    public boolean delete(int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        //1. Шукаємо у дереві вузол для видалення
        while (current.getData() != key) {
            parent = current;
            if (key < current.getData()) {
                isLeftChild = true;
                current = current.getLeft();
            } else {
                isLeftChild = false;
                current = current.getRight();
            }
            if (current == null)

// 2. Якщо вузол відсутній – нічого не робимо і повертаємо false
                return false;
        }
//3.1 Якщо вузол лист – видаляємо посилання на вузол в батьківського вузла
        if (current.getLeft() == null && current.getRight() == null) {
            if (current == root)
                root = null;
            else if (isLeftChild)
                parent.setLeft(null);
            else
                parent.setRight(null);
        }
//3.2  Якщо вузол має лівого нащадка – ставимо лівого нащадка на місце вузла. Тобто, у батьківського вузла міняємо посилання так, що замість вузла що видаляється стає його лівий нащадок
        else if (current.getRight() == null) {
            if (current == root)
                root = current.getLeft();
            else if (isLeftChild)
                parent.setLeft(current.getLeft());
            else
                parent.setRight(current.getLeft());
        } else if (current.getLeft() == null) {
            if (current == root)
                root = current.getRight();
            else if (isLeftChild)
                parent.setLeft(current.getRight());
            else
                parent.setRight(current.getRight());
        }
//3.3  Якщо вузол має двох нащадків:
//        Знаходимо наступника вузла.
//                У наступника ставимо лівим нащадком лівий вузол  вузла, що видаляється.
//                У батьківського вузла ставимо правим нащадком наступника.
        else {
            Node successor = prepareSuccessor(current);

            if (current == root)
                root = successor;
            else if (isLeftChild)
                parent.setLeft(successor);
            else
                parent.setRight(successor);

            return true;
        }
        return false;
    }

    private Node prepareSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.getRight();
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.getLeft();
        }

        if (successor != delNode.getRight()) {
            successorParent.setLeft(successor.getRight());
            successor.setRight(delNode.getRight());
        }

        successor.setLeft(delNode.getLeft());

        return successor;
    }


}
