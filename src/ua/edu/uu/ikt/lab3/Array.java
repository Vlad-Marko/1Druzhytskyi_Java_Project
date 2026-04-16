package ua.edu.uu.ikt.lab3;



public class Array {

    public Array(int count) {
    arr = new int[count];
}

    public Array() {
        arr = new int[0];
    }

    private int[] arr;

    public int[] getArr() {
        return arr;
    }



    public void add(int value){

//        System.out.println(arr1);

            int[] tmp = new int[arr.length+1];
            int i = 0;
            for(int j: arr){
                tmp[i] = j;
                i++;
            }
            tmp[i] = value;
            arr = tmp;


    }
    public String remove(int index){
        if(index > arr.length || index<0){
            return "Невалідний індекс";
        }
        int j = -1;
        String removeValue = "";
        int[] tmp = new int[arr.length-1];
        boolean flag = false;

        for (int value: arr){
            if (arr[index] == value){
                flag = true;
                removeValue = "" + value;
                continue;
            }
            j++;
            tmp[j] = value;
        }
        if (flag) arr = tmp;
        return removeValue;
    }

    public void getValues(){
        System.out.print("[ ");
        for (int value: arr){
            System.out.print(value+", ");
        }
        System.out.println("]");
    }

    public static void displayArray(int[] array){
        System.out.print("[ ");
        for (int value: array){
            System.out.print(value+", ");
        }
        System.out.println("]");
    }
    public void getIndexesAndValues(){
        for (int i = 0; i < arr.length; i++){
            System.out.println("Індекс елемента: " + i);
            System.out.println("\t Значення елемента: " + arr[i]);
        }
    }
    public void filling(){
         for (int i = 0; i< arr.length; i++){
            arr[i] = i+1;
         }
    }
    public void set(int value, int index){
        if(index >= 0 && index <= arr.length){
        arr[index] = value;}
        else {
            System.out.println("Невалідний індекс");
        }
    }
    public void filling(int[] tmp){
        int index = -1;

        for (int value: tmp){
            index++;
            if(arr.length >= tmp.length){
            arr[index] = value;
            }else {
                add(value);
            }
        }
    }


    // завдання 4
    static int findIndexOfElement(int[] arr, int element){
        int index = -1;
        for (int value: arr){
            index++;
            if (value == element){
                return index;
            }
        }
        return -1;

    }


    public String deleteElement(int element){

        int j = -1;
        String removeValue = "";
        int[] tmp = new int[arr.length-1];
        boolean flag = false;

        for (int value: arr){
            if (element == value){
                flag = true;
                removeValue = "" + value;
                continue;
            }
            try {
                j++;
                tmp[j] = value;
            } catch (ArrayIndexOutOfBoundsException e){
                return "Масив немає значення";
            }

        }
        if (flag) arr = tmp;
        return removeValue;
    }

//
//      LAB 3
//

    public static int[] createRandomArray(int arraySize){
        int[] arr = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            arr[i] = (int) (Math.random()*1000);

        }
        return arr;
    }
    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int value: array)
            if (value<min){
                min = value;
            }
        return min;
    }
    public static int findMax(int[] array){
        int max = Integer.MIN_VALUE;
        for (int value: array)
            if (value>max){
                max = value;
            }
        return max;
    }

    //
    // 3 завдання
    public static void swap(int[] array, int left, int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;

    }
    // завдання 4

    public static int[] bubbleSort(int[] array, boolean increase){
        if (increase){
        for(int i = array.length - 1;i>0;i--){
            for (int j = 0; j < i ;j++){
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }
        }else {
            for(int i = array.length - 1;i>0;i--){
                for (int j = 0; j < i ;j++){
                    if(array[j]<array[j+1]){
                        swap(array,j,j+1);
                    }
                }
            }
        }
        return array;
    }
    static int[] selectSort(int[] array, boolean increase){
        if (increase){
        for(int i = 0;i < array.length ;i++){
            int minElementIndex = i;
            for (int j = i;j < array.length;j++){
                if(array[j] < array[minElementIndex]){
                    minElementIndex = j;
                }

            }
            swap(array,i,minElementIndex);
        }
        }else {
            for(int i = 0;i < array.length ;i++){
                int maxElementIndex = i;
                for (int j = i;j < array.length;j++){
                    if(array[j] > array[maxElementIndex]){
                        maxElementIndex = j;
                    }

                }
                swap(array,i,maxElementIndex);
        }
        }
        return array;

    }


}
