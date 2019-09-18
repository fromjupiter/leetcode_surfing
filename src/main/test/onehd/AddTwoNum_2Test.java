package onehd;

import misc.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNum_2Test {
    @Test
    public void addTwoNumbersTest() throws Exception {
        ListNode n1 = ListNode.makeNum(498);
        ListNode n2 = ListNode.makeNum(3214);

        ListNode sum = new AddTwoNum_2().addTwoNumbers(n1, n2);
        assertEquals(3712, ListNode.getNum(sum));
        assertEquals(10, ListNode.getNum(new AddTwoNum_2().addTwoNumbers(ListNode.makeNum(5), ListNode.makeNum(5))));
    }

}