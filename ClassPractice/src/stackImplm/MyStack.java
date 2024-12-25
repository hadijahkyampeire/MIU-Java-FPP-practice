package stackImplm;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack {
    private int[] stack;
    private int top;

    public MyStack(int capacity) {
        stack = new int[capacity];
        top = -1;
    }

    public void push(int data) {
        if(top == stack.length - 1) {
            resize();
        }
        stack[++top] = data;
    }

    public void resize() {
        int[] temp = new int[stack.length * 2];
        System.arraycopy(stack, 0, temp, 0, stack.length);
        stack = temp;
        // stack = Arrays.copyOf(stack, stack.length*2)
    }

    public int pop() {
        if (top == -1) throw new EmptyStackException();
        int temp = stack[top];
        stack[top] = 0;
        top--;
        return temp;
    }

    public void printAll() {
        System.out.print("[ ");
        for(int i: stack) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        MyStack myStack = new MyStack(10);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.printAll();
        System.out.println(myStack.pop());
        myStack.printAll();

    }
}

