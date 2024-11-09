package Java;


import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        TestQueue q = new TestQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.poll());
        q.add(5);
        System.out.println(q.poll());
    }


}

class TestQueue {
    Stack<Integer> firstStack;
    Stack<Integer> secondStack;

    public TestQueue() {
        firstStack = new Stack();
        secondStack = new Stack();
    }

    public void add(int num) {
        firstStack.push(num);
    }

    public int poll() {
        int firstSize = firstStack.size();
        for (int i = 0; i < firstSize; i++) {
            secondStack.push(firstStack.pop());

        }
        System.out.println("-----------for---");

        for (Integer integer : secondStack) {
            System.out.println(integer);
        }
        System.out.println("-----------end---");

        int res = secondStack.pop();
        int secondSize = secondStack.size();
        for (int i = 0; i < secondSize; i++) {
            firstStack.push(secondStack.pop());
        }
        return res;
    }
}
