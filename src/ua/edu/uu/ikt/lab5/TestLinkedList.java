package ua.edu.uu.ikt.lab5;

public class TestLinkedList {
    static void main() {

        List list = new LinkedList();

        list.add(5);
        list.add(7);
        list.add(2);

        System.out.print("list: ");
        list.display();
        System.out.println();
        while (!list.isEmpty()) {
            System.out.println("remove element: " + list.remove());
            System.out.print("display after remove: ");
            list.display();
            System.out.println();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(2);

        System.out.println(list.isEmpty());

        System.out.println(linkedList.remove(7));

        linkedList.display();


    }
}
