package onehd;

import misc.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/18.
 */
public class MergeKSortedList_23Test {
    @Test
    public void mergeKLists() throws Exception {
        MergeKSortedList_23 test = new MergeKSortedList_23();
        ListNode[] tt = new ListNode[] {ListNode.makeNum(541),ListNode.makeNum(431),ListNode.makeNum(62)};
        assertEquals(65443211, ListNode.getNum(test.mergeKLists(tt)));
        tt = new ListNode[]{null};
        assertEquals(null,test.mergeKLists(tt));
        tt = new ListNode[]{null,null};
        assertEquals(null,test.mergeKLists(tt));
    }

}