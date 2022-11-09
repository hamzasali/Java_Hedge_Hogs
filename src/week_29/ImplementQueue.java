package week_29;

import java.util.Stack;

public class ImplementQueue {
    public static void main(String[] args) {
        ImplementQueue q = new ImplementQueue();
        q.enqueue(1);
        q.enqueue(2);
        System.out.println(q.dequeue());// prints 1
        q.enqueue(3);
        q.enqueue(4);
        System.out.println(q.isEmpty());// prints false
        q.enqueue(5);
        System.out.println(q.dequeue());// prints 2
        q.enqueue(6);
        System.out.println(q.peek());// prints 3


    }

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    void enqueue(int num) {
        stack1.push(num);
    }

    int peek() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    int dequeue() {
        peek();
        return stack2.pop();
    }

    boolean isEmpty() {
        return stack1.empty() && stack2.isEmpty();
    }
}
