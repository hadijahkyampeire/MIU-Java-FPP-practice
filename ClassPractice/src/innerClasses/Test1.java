package innerClasses;

// Outer class
public class Test1 {
    private MyInner inner;

    public MyInner getInner() {
        return inner;
    }

    // Inner class
    private class MyInner {
        private int innertInt;
        MyInner(int x) {
            innertInt = x;
        }
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        MyInner inner = t.getInner();
        System.out.println(inner.innertInt);
    }

}
