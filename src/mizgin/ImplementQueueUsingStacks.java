package mizgin;

public class ImplementQueueUsingStacks {

    public static void main(String[] args) {
        //                                                  input      output
        MyQueue q = new MyQueue();
        q.enqueue(1); //                                   1          -
        q.enqueue(2); //                                   1,2        -
        System.out.println(q.dequeue()); // prints 1          -          2
        q.enqueue(3); //                                   3          2
        q.enqueue(4); //                                   3,4        2
        System.out.println(q.empty()); // prints false
        q.enqueue(5); //                                   3,4,5      2
        System.out.println(q.dequeue()); // prints 2          3,4,5      -
        q.enqueue(6); //                                   3,4,5,6    -
        System.out.println(q.peek()); // prints 3               -        3,4,5,6



        MyQueue m = new MyQueue();
        //                  input    output
        m.enqueue(2); // 2
        m.enqueue(1); // 2,1
        m.enqueue(9); // 2,1,9
        m.dequeue(); //                 1,9
        m.enqueue(8); // 8           1,9,
        m.dequeue(); //     8           9,
        m.enqueue(6); // 8,6         9,
        m.dequeue(); //     8,6
        m.dequeue(); //                 6
        System.out.println(m.dequeue()); // -
        System.out.println(m.empty());

    }

}
