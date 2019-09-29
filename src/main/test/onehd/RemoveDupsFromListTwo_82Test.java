package onehd;

import misc.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/28.
 */
public class RemoveDupsFromListTwo_82Test {
    @Test
    public void deleteDuplicates() throws Exception {
        RemoveDupsFromListTwo_82 test = new RemoveDupsFromListTwo_82();
        assertEquals(null, test.deleteDuplicates(ListNode.makeNum(11)));
        assertEquals(521, ListNode.getNum(test.deleteDuplicates(ListNode.makeNum(5443321))));
    }

}