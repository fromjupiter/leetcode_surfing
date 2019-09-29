package onehd;

import misc.ListNode;

/**
 * Created by Kexiang on 2019/9/28.
 */
public class RemoveDupsFromListTwo_82 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode dummyHead = new ListNode(Integer.MAX_VALUE);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        ListNode curr = head;
        boolean flag = false;
        while(curr!=null){
            if(curr.next!=null && curr.next.val == curr.val){
                //detect dups
                flag = true;
            } else {
                if(flag){
                    //remove dups
                    prev.next = curr.next;
                    flag = false;
                } else {
                    //move prev cursor
                    prev = curr;
                }
            }
            curr = curr.next;
        }

        return dummyHead.next;
    }
}
