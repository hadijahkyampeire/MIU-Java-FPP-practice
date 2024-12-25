package StackArray;

public class ArrayStack {
    private int[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new int[capacity];
        top = -1;
    }

    // Push method
    public void push(int element) {
        if (top == stack.length - 1) {
          throw new RuntimeException("Stack is full");
        }
        stack[++top] = element;
    }

    // Pop method
    public int pop() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty");
        };
        int poppedElement = stack[top];
        top--;

        return poppedElement;
    }

    // Peek method
    public int peek() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty");
        };

        return stack[top];
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        try {
            stack.push(10);
            stack.push(20);
            System.out.println("Top element: " + stack.peek());
            stack.pop();
            System.out.println("Top element after pop: " + stack.peek());
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}

