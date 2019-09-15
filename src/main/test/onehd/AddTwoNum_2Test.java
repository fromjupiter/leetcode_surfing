package onehd;

import misc.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNum_2Test {
    @Test
    public void addTwoNumbersTest() throws Exception {
        ListNode n1 = makeNum(498);
        ListNode n2 = makeNum(3214);

        ListNode sum = new AddTwoNum_2().addTwoNumbers(n1, n2);
        assertEquals(3712, getNum(sum));
        assertEquals(10, getNum(new AddTwoNum_2().addTwoNumbers(makeNum(5), makeNum(5))));
    }

    private ListNode makeNum(int x) {
        ListNode dummyStart = new ListNode(-1);
        ListNode p = dummyStart;
        while (x != 0) {
            p.next = new ListNode(x%10);
            p = p.next;
            x/=10;
        }
        return dummyStart.next;
    }

    private long getNum(ListNode node) {
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