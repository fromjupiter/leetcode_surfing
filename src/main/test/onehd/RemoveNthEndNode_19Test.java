package onehd;

import misc.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/17.
 */
public class RemoveNthEndNode_19Test {
    @Test
    public void removeNthFromEndTest() throws Exception {
        RemoveNthEndNode_19 test = new RemoveNthEndNode_19();
        assertEquals(2,ListNode.getNum(test.removeNthFromEnd(ListNode.makeNum(21),2)));
        assertEquals(1,ListNode.getNum(test.removeNthFromEnd(ListNode.makeNum(21),1)));
        assertEquals(21,ListNode.getNum(test.removeNthFromEnd(ListNode.makeNum(321),1)));
        assertEquals(0,ListNode.getNum(test.removeNthFromEnd(ListNode.makeNum(1),1)));
        assertEquals(5321,ListNode.getNum(test.removeNthFromEnd(ListNode.makeNum(54321),2)));
    }

}