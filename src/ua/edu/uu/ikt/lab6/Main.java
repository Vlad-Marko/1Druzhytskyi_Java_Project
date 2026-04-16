package ua.edu.uu.ikt.lab6;

import ua.edu.uu.ikt.lab3.Array;



public class Main {
    static void main() {

        System.out.println(Sum.sum(5));

        System.out.println(Sum.sum(9));


        System.out.println(Factorial.factorial(5));

        for (int i = 0; i < 10; i++) {
            System.out.println(i+"! = " + Factorial.factorial(i));
        }


        // 4 задача
        System.out.println("4 задача");

        int[] left = new int[]{1, 7, 8, 20};   		// розмір масиву 4
        int[] right = new int[]{2, 3, 5, 9, 11, 15};                 // розмір масиву 6
        int[] array = new int[left.length + right.length];   // розмір масиву 10
        Merge.merge(array, left, right);
        for (int t: array)
            System.out.print(t + " " );
        System.out.println();

        //задача 5
        int[] array1 = Array.createRandomArray(10);
        Array.displayArray(array1);
        MergeSort.mergeSort(array1);
        for (int t: array1)
            System.out.print(t + " " );
        Array.displayArray(array1);

    }
}
