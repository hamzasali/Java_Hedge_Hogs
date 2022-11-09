package Marika;

public class DeleteNNode2Solution {
    public ListNode deleteNodes(ListNode head, int m, int n) {
                 ListNode cur = head;
                 ListNode pre = null;
                 while (cur != null) {
                         int i = m;
                         int j = n;
                         while (cur != null && i > 0) {
                                 pre = cur;
                                 cur = cur.next;
                                 i--;
                             }
                         while (cur != null && j > 0) {
                                cur = cur.next;
                                j--;
                             }
                         pre.next = cur;
                    }
                 return head;
            }
}
