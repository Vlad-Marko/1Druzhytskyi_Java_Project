package ua.edu.uu.ikt.lab2;

public class Main {
    static void main() {
        Array arr1 = new Array(5);
        System.out.println("Заповнення послідовними елементами");
        arr1.filling();

        arr1.getValues();
        System.out.println("Видалення елемента");
        arr1.remove(1);

        arr1.getValues();
        System.out.println("Додавання елемента");
        arr1.add(10);

        arr1.getValues();
        arr1.getIndexesAndValues();

        // завдання 2
        System.out.println();
        System.out.println("завдання 2");
        System.out.println();
        Array arr2 = new Array(20);
        arr2.filling(arr1.getArr());
        arr2.getIndexesAndValues();

        // завдання 3
        System.out.println();
        System.out.println("завдання 3");
        System.out.println();
        arr2.set(25,5);
        arr2.set(50,6);
        arr2.set(199,7);
        arr2.getIndexesAndValues();

        // завдання 4
        System.out.println();
        System.out.println("завдання 4");
        System.out.println();
        System.out.println("Індекс шуканого значення: " + Array.findIndexOfElement(arr2.getArr(), 200));
        System.out.println("Індекс шуканого значення: " + Array.findIndexOfElement(arr2.getArr(), 10));

        // завдання 5
        System.out.println();
        System.out.println("Завдання 5");
        System.out.println();

        System.out.println(arr2.deleteElement(111));
        System.out.println(arr2.remove(7));
        arr2.getIndexesAndValues();
        // завдання 5 (приклад з інструкцій)
        System.out.println();
        System.out.println("завдання 5 (приклад з інструкцій)");
        System.out.println();
        int[] arrTmp = {2, -5, 3, 56, 24};
        Array arr3 = new Array();
        System.out.println();
        arr3.getIndexesAndValues();

        arr3.filling(arrTmp);
        arr3.getIndexesAndValues();
        System.out.println();

        arr3.deleteElement(-5);
        arr3.getIndexesAndValues();
    }
}
