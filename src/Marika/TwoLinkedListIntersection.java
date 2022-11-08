package Marika;


import java.util.HashSet;

public class TwoLinkedListIntersection {

    public ListNode solution2(ListNode list1, ListNode list2) {
        HashSet set = new HashSet();

        ListNode current1 = list1;
        while(current1 != null){
            set.add(current1);
            current1 = current1.next;
        }

        ListNode current2 = list2;

        while(current2 != null){

            if(set.contains(current2)){
                return current2;
            }
            current2 = current2.next;
        }

        return null;
    }

    public static void main(String[] args) {



    }

}
