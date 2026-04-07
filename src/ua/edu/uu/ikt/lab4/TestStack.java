package ua.edu.uu.ikt.lab4;

public class TestStack {
     static void main() {
        Stack stack = new StackImpl();
        stack.push(34);
        stack.push(5);
        System.out.println("Stack size is: " + stack.size());
        System.out.println("Stack isEmpty: " + stack.isEmpty());
        System.out.println("Stack isFull: " + stack.isFull());
        System.out.println("Peek element:" + stack.peek());
        System.out.println("Peek element:" + stack.peek());
        System.out.println("Peek element:" + stack.peek());
        System.out.println("Stack size is: " + stack.size());
        System.out.println("Stack isEmpty: " + stack.isEmpty());
        System.out.println("Stack isFull: " + stack.isFull());
        System.out.println("Pop element:" + stack.pop());
        System.out.println("stack size is: " + stack.size());
        System.out.println("stack isEmpty: " + stack.isEmpty());
        System.out.println("stack isFull: " + stack.isFull());
        System.out.println("Peek element:" + stack.peek());
        System.out.println("Peek element:" + stack.peek());
        System.out.println("Peek element:" + stack.peek());
        System.out.println("Pop element:" + stack.pop());
        System.out.println("stack size is: " + stack.size());
        System.out.println("stack isEmpty: " + stack.isEmpty());
        System.out.println("stack isFull: " + stack.isFull());

    }
}

