package ua.edu.uu.ikt.lab3;

public class Main {
    static void main() {
        // 1 завдання

        Array array = new Array();
        array.filling(Array.createRandomArray(10));
        array.getValues();

        // 2 завдання
        System.out.println("Мінімальне значення масиву: " + Array.findMin(array.getArr()));
        // 3 завдання
        System.out.println("Максимальне значення масиву: " + Array.findMax(array.getArr()));
        //4  завдання
        array.getValues();
        System.out.println("bubble sort");
        Array.bubbleSort(array.getArr(),false);
        array.getValues();
        //5 завдання
        array.filling(Array.createRandomArray(10));
        array.getValues();
        System.out.println("select sort");
        Array.selectSort(array.getArr(),false);
        array.getValues();






    }
}
