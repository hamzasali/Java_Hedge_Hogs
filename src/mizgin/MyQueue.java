package mizgin;

import java.util.Stack;

public class MyQueue {

    private Stack<Integer> input = new Stack<>();
    private Stack<Integer> output = new Stack<>();

    //Pushes element x to the back of queue
    public void enqueue(int x) {
        input.push(x);
    }

    //Removes the element from in front of queue and returns that element
    public int dequeue() {
        if (output.isEmpty()) {
            insertFromInputToOutput();
        }
        return output.pop();
    }

    //Get the front element
    public int peek() {
        if (output.isEmpty()) {
            insertFromInputToOutput();
        }
        return output.peek();
    }

    //Returns whether the queue is empty
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    public void insertFromInputToOutput() {
        while (!input.isEmpty()) {
            int temp = input.pop();
            output.push(temp);
        }
    }

}
