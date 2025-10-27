package LearnQueues;

import java.util.ArrayDeque;

public class LearnDeque {
    public static void main(String[] args) {
        System.out.println("This is a simple LearnDeque class.");
        ArrayDeque<Integer> dq= new ArrayDeque<>();
        //adding elements
        dq.offer(10);
        dq.offer(30);
        dq.offer(20);
        dq.offer(40);
        System.out.println(dq);
        //removing elements
        System.out.println(dq.poll());
        System.out.println(dq);
        //remove from last
        System.out.println(dq.pollLast());
        System.out.println(dq);
    }
}
