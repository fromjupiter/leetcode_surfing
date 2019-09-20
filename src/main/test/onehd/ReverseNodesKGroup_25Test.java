package onehd;

import misc.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/19.
 */
public class ReverseNodesKGroup_25Test {
    @Test
    public void reverseKGroupTest() throws Exception {
        ReverseNodesKGroup_25 test = new ReverseNodesKGroup_25();
        assertEquals(null, test.reverseKGroup(null, 2));
        assertEquals(53412, ListNode.getNum(test.reverseKGroup(ListNode.makeNum(54321), 2)));
        assertEquals(54123, ListNode.getNum(test.reverseKGroup(ListNode.makeNum(54321), 3)));
    }
}