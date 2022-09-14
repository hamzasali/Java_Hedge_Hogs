package alena.twoSum_LinkedList;

public class MyList<T> {

    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(int data) {
        //create a new node object from data
        Node node = new Node(data);

        if (isEmpty()) { //if the list is empty
            head = tail = node;
            size++;
        } else { //if list is not empty
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public int[] twoSum(int[] nums, int target){
        if(isEmpty()) System.out.println("List is empty");
        Node current=head;
        Node prev=head;
        Node next=tail;
        int[] twoSum=new int[2];
        while(current!=null){
            //if(current.id+tail.id==target){
                if(target- current.id== tail.id){
                twoSum[0]=current.getId();
                twoSum[1]=tail.getId();
            }
            current=current.next;
            tail=prev;
            prev.next=null;
        }
        return twoSum;
    }

}
