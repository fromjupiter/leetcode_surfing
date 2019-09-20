package onehd;

import misc.ListNode;

/**
 * Created by Kexiang on 2019/9/19.
 */
public class SwapNodesInPairs_24 {
    /**
     * Simple, but got 100%-100%
     */
    public ListNode swapPairs(ListNode head) {
        ListNode curr = head;
        ListNode prev = new ListNode(0);
        prev.next = curr;
        ListNode pprev = new ListNode(0);
        pprev.next = prev;

        head = prev;
        int count = 0;
        while (curr != null) {
            if(count%2==1) {
                pprev.next = curr;
                prev.next = curr.next;
                curr.next = prev;
                prev = pprev.next;
                curr = prev.next;
            }
            curr = curr.next;
            prev = prev.next;
            pprev = pprev.next;
            ++count;
        }

        return head.next;
    }
}
