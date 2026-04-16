package ua.edu.uu.ikt.lab6;

public class MergeSort {

    public static void mergeSort(int[] array){

        int n = array.length;

        if(n < 2){
            return;
        }

        int mid = n / 2;

        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for(int i = 0;i < mid;i++){
            left[i] = array[i];
//            System.out.println("left " + i + ": " + left[i] + " and " + array[i]);
        }
        for(int i = mid;i < n;i++){
            right[i - mid] = array[i];
//            System.out.println("right " + i + ": " + right[i - mid] + " and " + array[i]);

        }

        mergeSort(left);
        mergeSort(right);

        Merge.merge(array,left,right);

    }
}
