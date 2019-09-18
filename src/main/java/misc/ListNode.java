package misc;


public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }


    public static ListNode makeNum(int x) {
        ListNode dummyStart = new ListNode(-1);
        ListNode p = dummyStart;
        while (x != 0) {
            p.next = new ListNode(x%10);
            p = p.next;
            x/=10;
        }
        return dummyStart.next;
    }

    public static long getNum(ListNode node) {
        long res = 0;
        long times = 1;
        while (node != null) {
            res = res + times * node.val;
            times *= 10;
            node = node.next;
        }
        return res;
    }
}