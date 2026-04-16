package ua.edu.uu.ikt.lab7;

import ua.edu.uu.ikt.lab3.Array;

public class QuickSort {


    static void swap(int[] array, int left, int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    static int partition(int[] array, int left, int right, int pivot){
        int currentIndex = left;
        int wall = left;
        while (currentIndex < right) {
            if (pivot >= array[currentIndex]) {
                swap(array, currentIndex, wall);
                currentIndex++;
                wall++;
            } else {
                currentIndex++;
            }

        }
        swap(array, right, wall);
        return wall;

    }
//    static int partition2(int[] array, int left, int right, int pivot){
//        int currentIndex = left;
//        int wall = left;
//        while (currentIndex < right) {
//            if (pivot <= array[currentIndex]) {
//                currentIndex++;
//            } else {
//                swap(array, currentIndex, wall);
//                currentIndex++;
//                wall++;
//            }
//        }
//        return wall - 1;
//
//    }

    public static void sort(int[] array, int left, int right){
        if (right <= left ) {
            return;
        }
        int pivot = array[right];
        int position = partition(array, left, right, pivot);

        sort(array, left, position - 1);
        sort(array, position + 1, right);

    }
//    public static void sort2(int[] array, int left, int right){
//        if (right <= left ) {
//            return;
//        }
//        int pivot = array[right-1];
//        int position = partition2(array, left, right, pivot);
//
//        sort2(array, left, position - 1);
//        sort2(array, position + 1, right);
//
//    }
}
