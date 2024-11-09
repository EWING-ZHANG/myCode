package TTT;

import java.util.Queue;
import java.util.Stack;
//栈来做队列 两个栈 入队列和出队列

public class Solution {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        for (int i = 0; i < 3; i++) {
            System.out.println(myQueue.poll());
        }

    }

}
