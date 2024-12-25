package innerClasses;

public class MyClass {
    private String s = "hello";
    public static void main(String[] args){
        new MyClass();
//        MyStaticNestedClass.myStaticMethod();
        MyStaticNestedClass myStaticNestedClass = new MyStaticNestedClass();
    }
    MyClass() {
//access static methods in the usual way
        MyStaticNestedClass.myStaticMethod();
//access instance methods in the usual way too
//except that now private methods are also accessible
        MyStaticNestedClass cl = new MyStaticNestedClass();
        cl.myOtherMethod();
//as with inner classes, private instance vbles are accessible
        int y = cl.x;
    }
    static class MyStaticNestedClass {
        private int x = 0;
        static void myStaticMethod() {
           // String t = s; //compiler error -- no access
        }
        private void myOtherMethod() {
        }
    }
}
class AnotherClass {
    public static void main(String[] args){
        MyClass.MyStaticNestedClass cl = new MyClass.MyStaticNestedClass(); //OK
        MyClass m = new MyClass();
//the following is illegal-- compiler error
         // MyClass.MyStaticNestedClass cl2 = m.new MyStaticNestedClass();
    }
}
