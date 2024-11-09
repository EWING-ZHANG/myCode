package TTT;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> stackFirst;
    Stack<Integer> stackEnd;

    public void add(int num) {
        stackFirst.push(num);
    }
    public MyQueue(){
        Stack<Integer> stackFirst=new Stack<>();
        Stack<Integer> stackEnd=new Stack<>();
        this.stackEnd=stackEnd;
        this.stackFirst=stackFirst;
    }

    public int poll() {
        //0表示现在是栈 first有值 end空
        //1表示现在放在end里面 是队列顺序放的
        int flag=0;
        if(flag==0){
            while(!stackFirst.isEmpty()){
                int temp = stackFirst.pop();
                stackEnd.push(temp);
            }
            flag=1;
        }
        return stackEnd.pop();
    }
}
