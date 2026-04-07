package ua.edu.uu.ikt.lab4;

public class StackImpl implements Stack {

    private int[] array = new int[100];

    private int numberOfElements = 0;



    @Override
    public void push(int element) {
        if (!isFull()){
            array[numberOfElements++] = element;
        }else {
            System.out.println("Масив заповнений. Дія неможлива");
        }
    }
    @Override
    public int pop() {

        if (isEmpty()){
            return 0;
        }
        return array[--numberOfElements];

    }

    @Override
    public int peek() {
        if (isEmpty()){
            return 0;
        }
        return array[numberOfElements - 1];
    }
    @Override
    public int size() {
        return numberOfElements;
    }
    @Override
    public boolean isEmpty() {
        return numberOfElements == 0;
    }
    @Override
    public boolean isFull() {
        return numberOfElements == array.length;
    }

}
