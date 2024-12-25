package innerClasses;

public class OuterClass {
    private String message = "Hello from OuterClass";

    // Member inner class
    public class InnerClass {
        // Complete this method to return the message from the outer class
        public String getMessage() {
            return message;
        }
    }

    public static void main(String[] args) {
        // Complete the code to create an instance of InnerClass and call getMessage()
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        System.out.println(inner.getMessage());
    }
}

