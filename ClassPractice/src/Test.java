//class Test {
//    static int divide(int a, int b) {
//        return a / b;
//    }
//
//    public static void main(String[] args) {
////        System.out.println(divide(10, 0));
//
//        String str = "Hello";
//        str.concat(" World");
//        System.out.println(str);
//    }
//}

//class Parent {
//    void method() throws Exception {
//        System.out.println("Parent method");
//    }
//}
//
//class Child extends Parent {
//    void method() {
//        System.out.println("Child method");
//    }
//
//    public static void main(String[] args) throws Exception {
//        Parent obj = new Child();
//        obj.method();
//    }
//}

interface Printable {
    void print();
}

enum Color implements Printable {
    RED, GREEN, BLUE;

    public void print() {
        System.out.println("Color: " + this.name());
    }

    public static void main(String[] args) {
        switch (Color.RED) {
            case RED: 
        }
    }
}