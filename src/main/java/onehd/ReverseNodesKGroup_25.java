package onehd;

import misc.ListNode;

/**
 * Created by Kexiang on 2019/9/19.
 */
public class ReverseNodesKGroup_25 {
    /**
     * Unlike swapping, we cannot pre-define 'prev' variable to help us.
     * So we need to go k steps each time, then start to manipulate the k-group
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while(curr != null) {
            ListNode tail = curr;
            for(int i=0;i<k;++i) {
                tail = tail.next;
                if(tail==null) return dummy.next;
            }
            //find a k-group, reverse it
            ListNode temp = curr.next;
            reverseList(curr, tail.next);
            curr = temp;
        }

        return dummy.next;
    }

    /**
     *   Reverse the list between dummy head and dummy tail
     */
    void reverseList(ListNode dummyHead, ListNode dummyTail) {
        ListNode prev =dummyTail;
        ListNode curr = dummyHead.next;
        ListNode next = curr;
        while(curr!=dummyTail) {
            //move next first to avoid NPE

            next = next.next;
            //manipulate list
            curr.next = prev;
            //move cursors
            prev = curr;
            curr = next;
        }
        dummyHead.next = prev;
        return;
    }
}
