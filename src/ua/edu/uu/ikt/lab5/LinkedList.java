package ua.edu.uu.ikt.lab5;

public class LinkedList implements List{

    public LinkedList() {
        this.first = null;
    }

    private Node first;
    // Метод add зсуває всі елементи вправо, включно з поточним first елементом, і на місце поточного first об'єкта вставляє новий.
    // Метод створює новий об`єкт класу Node з даними data. Далі цьому об'єкту присвоюється посилання на наступний об'єкт, поточний first.
    // Далі об'єкту first присвоюється значення newNode.

    // Ще один спосіб як я уявляю цю структуру(односторонній LInkedList). Ми створюємо коробку і кладемо в неї дані.
    // Коли ми створюємо другу коробку, ми кладемо в неї дані та попередню коробку. Ми не можемо нічого зробити з першою коробкою, поки не відкрили першу
    @Override
    public void add(int data) {
        Node newNode = new Node(data);
        newNode.setNext(first);
        first = newNode;
    }
    // Метод remove бере об'єкт first та присвоює йому значення(посилання) Next, яким він володіє на момент операції присвоєння.
    @Override
    public int remove() {
        if (first == null) {
            return 0;
        }
        Node tmp = first;
        first = first.getNext();
        return tmp.getData();
    }
    // Тут remove спершу перевіряє, чи пустий list. Далі Йде перевірка чи є шукані дані у first.
    // Якщо так відбувається видалення і вивід об'єкта(але без посилання на наступний об'єкт).
    // Інакше, метод ітерується по list і шукає відповідний об'єкт з даними data. Якщо не знаходить, то виводить null.
    //Інакше, видаляє та виводить цей об'єкт
    public Node remove(int data) {
        if (first == null) {
            return null;
        }

        if (first.getData() == data) {
            Node removed = first;
            first = first.getNext();
            removed.setNext(null);
            return removed;
        }

        Node current = first;

        while (current.getNext() != null &&
                current.getNext().getData() != data) {
            current = current.getNext();
        }

        if (current.getNext() == null) {
            return null;
        }

        Node removed = current.getNext();
        current.setNext(removed.getNext());
        removed.setNext(null);

        return removed;
    }
    // Перевіряє, чи має first посилання на об'єкт Node.
    @Override
    public boolean isEmpty() {
        return first == null;
    }
    // Метод створює об'єкт current і присвоює йому значення first. Далі виводяться дані що містить цей об'єкт і об'єкту
    // current присвоюється значення наступного об'єкта (посилання на яке має об'єкт current). Це продовжується доти,
    // доки об'єкт має посилання на об'єкт(не є null)
    @Override
    public void display() {
        Node current = first;
        System.out.print("[ ");
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println("]");
    }

    // Метод ітерується по списку і перевіряє кожен об'єкт на відповідність. Якщо знаходить, то повертає посилання на об'єкт
    // (None). Якщо ні, то повертає null.
    public Node find(int data) {
        Node current = this.first;

        while (current != null) {
            if (current.getData() == data) {
                return current;   // знайдено
            }
            current = current.getNext();
        }

        return null;
    }
}
