package ArrayListImplementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyStringList {
    private final int INITIAL_LENGTH = 4;
    private String[] strArray;
    private int size;

    public MyStringList() {
        strArray = new String[INITIAL_LENGTH];
        size = 0;
    }

    // Add an element in last
    public void add(String s) {
        if (s == null) {
            throw new NullPointerException();
        }
        if (size == strArray.length) {
            resize();
        }
        strArray[size++] = s;
    }

    public String get(int i) {
        if (i < 0 || i > size - 1) {
            throw new IndexOutOfBoundsException("Invalid index i" + i);
        }
        if (isEmpty()) {
            throw new NullPointerException();
        }
       return strArray[i];
    }

    public boolean find(String s) {
        if (s == null) {
            throw new IllegalArgumentException();
        }
        if (isEmpty()) {
            return false;
        }
        for (String str : strArray) {
            if (str.equals(s)) {
                return true;
            }
        }

        return false;
    }

    public void insert(String s, int pos) {
        if (pos < 0 || pos > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (s == null) {
            throw new IllegalArgumentException();
        }
        if (size == strArray.length) {
            resize();
        }
        String[] newArray = new String[strArray.length];
        for (int i = 0; i < pos; i++) {
            newArray[i] = strArray[i];
        }
        newArray[pos] = s;
        for (int i = pos + 1; i < strArray.length; i++) {
            newArray[i] = strArray[i - 1];
        }

        strArray = newArray;
        size++;
    }

    public boolean remove(String s) {
        if (s == null) {
            return false;
        }
        if (isEmpty()) {
            return false;
        }
        int index = -1;

        for (int i = 0; i < size; i++) {
            if (s.equals(strArray[i])) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        }

        String[] newArray = new String[strArray.length];
        System.arraycopy(strArray, 0, newArray, 0, index);
        System.arraycopy(strArray, index + 1, newArray, index, strArray.length - index - 1);
        strArray = newArray;
        --size;
        return true;
    }

    private void resize() {
        System.out.println("resizing");
        strArray = Arrays.copyOf(strArray, strArray.length * 2);

    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(strArray[i]).append(", ");
        }
        sb.append(strArray[size - 2]).append("]");
        return sb.toString();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        MyStringList l = new MyStringList();
        l.add("Bob");
        l.add("Steve");
        l.add("Susan");
        l.add("Mark");
        l.insert("Renuka", 4); // Position reached the length
        l.insert("Mohanraj", 5); // Position reached the length
        System.out.println(l);
        l.add("Dave");
        System.out.println("The list of size one: " + l.size() + " is " + l);
        l.remove("Mark");
        l.remove("Bob");
        System.out.println("The list of size two: " + l.size() + " is " + l);
        l.insert("Richard", 3);
        System.out.println("The list of size three: " + l.size() + " after inserting Richard into pos 3 is " + l);
        l.insert("Tonya", 0);
        System.out.println("The list of size four: " + l.size() + " after inserting Tonya into pos 0 is " + l);
        System.out.println(l.find("Susan"));

        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            list.add(l.get(i));
        }
        Collections.sort(list);
        System.out.println(list);



    }

}
