package onehd;

import misc.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/19.
 */
public class SwapNodesInPairs_24Test {
    @Test
    public void swapPairsTest() throws Exception {
        SwapNodesInPairs_24 test = new SwapNodesInPairs_24();
        //assertEquals(1, ListNode.getNum(test.swapPairs(ListNode.makeNum(1))));
        assertEquals(3412, ListNode.getNum(test.swapPairs(ListNode.makeNum(4321))));
        assertEquals(423, ListNode.getNum(test.swapPairs(ListNode.makeNum(432))));
    }

}