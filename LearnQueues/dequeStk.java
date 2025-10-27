package LearnQueues;

import java.util.ArrayDeque;

public class dequeStk {
    public static void main(String[] args) {
        System.out.println("This is a simple dequeStk class.");
        System.out.println("Using ArrayDeque as Stack and operation of the stack ");
        ArrayDeque<Integer> stk= new ArrayDeque<>();
        //addming elements
        stk.push(10);
        stk.push(20);
        stk.push(30);   
        stk.push(40);
        System.out.println(stk);
        //removing elements
        System.out.println(stk.pop());
        System.out.println(stk);
        System.out.println(stk.pollLast());
        System.out.println(stk);
        //peek
        System.out.println(stk.peek());
        System.out.println(stk);
    }
}
