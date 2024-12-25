package ArrayListImplementation;

import java.util.Arrays;

public class ElementsArrayList {
    private int[] elements;
    private int size;

    public ElementsArrayList() {
        elements = new int[10]; // Default capacity
        size = 0;
    }

    // Method to add an element at the end
    public void add(int element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    // Method to get an element by index
    public int get(int index) {
        if (size == 0) {
            throw new NullPointerException("Elements list is empty");
        }
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    // Method to remove an element by index
    public void remove(int index) {
        if (size == 0) return;
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        int[] temp = new int[elements.length];
        System.arraycopy(elements, 0, temp, 0, index);
        System.arraycopy(elements, index + 1, temp, index, elements.length - index - 1);
        elements = temp;
        size--;
    }

    // Method to return the size of the list
    public int size() {
        return size;
    }

    public void resize() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public static void main(String[] args) {
        ElementsArrayList list = new ElementsArrayList();
        try {
            list.add(5);
            list.add(10);
            System.out.println("Element at index 1: " + list.get(1));
            list.remove(0);
            System.out.println("Size: " + list.size());
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }

}
