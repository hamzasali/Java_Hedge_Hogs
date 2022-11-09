package Marika;

import java.util.Stack;

public class ImplementQueueUsingStacks {


    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();


    public void MyQueue() {

    }


    public void push(int x) {
      s1.push(x);
    }

    public int pop() {
        if(s2.isEmpty()){
            shiftStacks();
        }
        return s2.pop();
    }


    public int peek() {
        if(s2.isEmpty()) {
            shiftStacks();
        }
        return s2.peek();
    }


    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
    public void shiftStacks() {
        while(!s1.isEmpty()) {
            int temp = s1.pop();
            s2.push(temp);
        }
    }
}

