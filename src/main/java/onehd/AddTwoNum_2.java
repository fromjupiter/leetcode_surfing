package onehd;

import misc.ListNode;

public class AddTwoNum_2 {
    /*
        consider two numbers with different digits:
        498+3214

        8-9-4
        4-1-2-3

        only beat ~80% in time and space
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode dummyStart = new ListNode(-1);
        ListNode res = dummyStart;
        int carry = 0;
        while (p1 != null && p2 != null) {
            int sum = p1.val + p2.val + carry;
            carry = sum>=10 ? 1 : 0;
            res.next = new ListNode(sum-carry*10);

            p1 = p1.next;
            p2 = p2.next;
            res= res.next;
        }
        ListNode pp = p1 != null ? p1 : (p2 !=null ? p2 : null);
        while (pp!=null) {
            int sum = pp.val + carry;
            carry = sum>=10 ? 1 : 0;
            res.next = new ListNode(sum - carry*10);

            pp = pp.next;
            res= res.next;
        }
        if(carry != 0) res.next = new ListNode(1);
        return dummyStart.next;
    }
}
