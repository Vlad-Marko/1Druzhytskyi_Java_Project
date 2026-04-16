package ua.edu.uu.ikt.lab6;

public class Merge {
    public static void merge(int[] array, int[] left, int[] right){
        int i = 0, j = 0, k = 0;

        while(i < left.length && j <right.length){
            if (left[i] < right[j]){
                array[k++] = left[i++];
            }else {
                array[k++] = right[j++];
            }

        }
        while(i < left.length){
            array[k++] = left[i++];

        }
        while (j < right.length){
            array[k++] = right[j++];
        }

        
    }
}
