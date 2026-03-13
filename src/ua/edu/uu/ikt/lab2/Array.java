package ua.edu.uu.ikt.lab2;



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
        for (int value: arr){
            System.out.println(value);
        }
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

//    static void deleteElement(int[] arr, int element){
//
//        int j = -1;
//        String removeValue = "";
//        int[] tmp = new int[arr.length-1];
//        boolean flag = false;
//
//        for (int value: arr){
//            if (element == value){
//                flag = true;
//                removeValue = "" + value;
//                continue;
//            }
//            try {
//                j++;
//                tmp[j] = value;
//            }catch (ArrayIndexOutOfBoundsException e){
//                System.out.println("Масив немає значення");
//            }
//
//        }
//        if (flag) {arr = tmp;}
//
//    }


}
