interface A {
    default void display() {
        System.out.println("Interface A");
    }
}

class B {
    public void display() {
        System.out.println("Class B");
    }
}

class C extends B implements A {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}
