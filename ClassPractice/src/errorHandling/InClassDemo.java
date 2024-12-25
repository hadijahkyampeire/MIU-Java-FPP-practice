package errorHandling;

import java.util.Scanner;

public class InClassDemo {

    public static void main(String[] args) {
        // Showing All the runtime exception/Unchecked  developer can face
        System.out.println("Start");
        int x = 10;
        int y = 0;
        // 1. ArithmeticException
        // throw runtime exception using throw
//        if(y==0)// throw new ArithmeticException(); // No msg displayed on the console
//            throw new ArithmeticException("Input should not be zero");
//        else
//            System.out.println(x/y);

        // 2. ClassCastException
        Object a = new Integer(20);
        //	String a1 = (String)a;
        System.out.println("End");

        // 3. NullPointerException
        String s=null;
        //System.out.println(s.length());
        Float[] f = new Float[10];
        //f[0] = 23.5f;
        //	System.out.println(f[0].compareTo(12.5f));

        //4.ArrayIndexOutofBoundsException
        //	System.out.println(f[10]);

        //5. NumberFormatException

        String x1 = "10s";
        // int  res =  Integer.parseInt(x1);// Integer.valueOf(x1);
        //System.out.println(res);

        // 6. InputMismatch Exception
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a int value");
        int b = input.nextInt();


    }

}
