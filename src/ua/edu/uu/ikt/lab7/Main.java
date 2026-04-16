package ua.edu.uu.ikt.lab7;

import ua.edu.uu.ikt.lab3.Array;

public class Main {

    static void main() {
        int[] array  = {15, 3, 9, 4, 5, 7};
        int[] array2 = {15, 3, 9, 4, 5, 7};


        Array.displayArray(array);

        int pos = QuickSort.partition(array, 0, 5, 7);
        Array.displayArray(array);
        System.out.println(pos);
//        Array.displayArray(array2);
//        int pos2 = QuickSort.partition2(array2, 0, 6, 7);
//        Array.displayArray(array2);
//        System.out.println(pos2);

        int[] array3 = Array.createRandomArray(10);
        Array.displayArray(array3);
        QuickSort.sort(array3,0,array3.length-1);

        Array.displayArray(array3);


        // 2 метод
//        int[] array4 = Array.createRandomArray(10);
//        Array.displayArray(array4);
//        QuickSort.sort2(array4,0,array3.length);
//        Array.displayArray(array4);

    }
}
