package onehd;

import misc.ListNode;

import java.util.Arrays;
/**
 * Created by Kexiang on 2019/9/18.
 */
public class MergeKSortedList_23 {
    /**
     * naive approach which is 6%-5%
     */
    public ListNode mergeKLists_v0(ListNode[] lists) {

        ListNode dummyStart = new ListNode(0);
        lists = Arrays.stream(lists).filter(listNode -> listNode!=null).toArray(ListNode[]::new);
        if(lists.length==0) return null;
        int min = findMinIndex(lists);
        ListNode curr = dummyStart;
        while(min != -1) {
            //pick the first element from fist array in result
            curr.next = lists[min];
            curr= curr.next;
            lists[min]=lists[min].next;
            //move the first array
            min = findMinIndex(lists);
        }
        return dummyStart.next;
    }

    int findMinIndex(ListNode[] lists) {
        int i=0;
        while(i<lists.length && null==lists[i]) ++i;
        if(i==lists.length) return -1;
        int min = i;
        while (i < lists.length) {
            if(lists[i]!=null && lists[i].val<lists[min].val) min=i;
            ++i;
        }
        return min;
    }

    /**
     * Another naive approach to merge every two lists
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;

        ListNode ans = lists[0];
        for(int i=1;i<lists.length;++i){
            ans = mergeTwoLists(ans, lists[i]);
        }
        return ans;
    }

    public ListNode mergeTwoLists(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(left!=null && right !=null) {
            if(left.val<right.val){
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }
        if(left==null){
            curr.next = right;
        } else if(right==null){
            curr.next = left;
        }
        return dummy.next;
    }
}
