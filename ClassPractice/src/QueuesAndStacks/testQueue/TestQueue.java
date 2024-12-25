package QueuesAndStacks.testQueue;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(1);
        myQueue.add(2);
        System.out.println(myQueue);
        System.out.println(myQueue.remove());
        System.out.println(myQueue.peek());
    }
}
