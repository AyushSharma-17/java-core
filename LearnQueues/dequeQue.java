package LearnQueues;

import java.util.ArrayDeque;

public class dequeQue {
    public static void main(String[] args) {
        System.out.println("This is a simple dequeQue class.");
        System.out.println("Using ArrayDeque as Queue and operation of the Queue ");

        ArrayDeque<Integer> que= new ArrayDeque<>();
        //using the queue operations
        //adding elements
        que.offer(10);
        que.offer(20);
        que.offer(30);
        que.offer(40);
        System.out.println(que);
        //removing elements
        System.out.println(que.poll());       //removes from last
        System.out.println(que);
        System.out.println(que.pollFirst());   //removes from first
        System.out.println(que);

    }
}
