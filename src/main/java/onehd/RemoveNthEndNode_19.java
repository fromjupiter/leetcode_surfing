package onehd;

import misc.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Kexiang on 2019/9/17.
 */
public class RemoveNthEndNode_19 {
    /**
     * little memory overhead and slow in general
     */
    public ListNode removeNthFromEnd_v0(ListNode head, int n) {
        //given n is always valid, we don't consider edge case
        List<ListNode> track = new LinkedList<>();
        ListNode iter = head;
        while (iter != null) {
            if(n+1<=track.size()) track.remove(0);
            track.add(iter);
            iter = iter.next;
        }
        if(track.size() == n) {
            return track.get(0).next;
        }
        //do remove
        track.get(0).next = track.get(1).next;
        return head;
    }

    /**
     * It beats 100% and 100%, but it's not actually one pass..
     */
    public ListNode removeNthFromEnd_v1(ListNode head, int n) {
        //given n is always valid, we don't consider edge case
        ListNode iter = head;
        int count = 0;
        while (iter != null) {
            ++count;
            iter = iter.next;
        }
        if(count==n) return head.next;
        ListNode p = head;
        for(int i=0;i<count-n-1;++i) {
            p = p.next;
        }
        p.next = p.next.next;
        return head;
    }

    /**
     * One pass for real! 100% & 100% for real babe!
     * It's basic "chasing pointer" strategy
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //given n is always valid, we don't consider edge case
        ListNode iter = head;
        ListNode dummyStart = new ListNode(0);
        dummyStart.next = head;
        ListNode insPoint = dummyStart;
        int count = 0;
        while(count<n){
            iter = iter.next;
            ++count;
        }
        while (iter != null) {
            iter = iter.next;
            insPoint=insPoint.next;
        }

        if(insPoint==dummyStart) return head.next;
        insPoint.next = insPoint.next.next;
        return head;
    }
}
