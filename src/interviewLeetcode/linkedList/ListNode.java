package interviewLeetcode.linkedList;

import java.util.HashSet;
import java.util.Set;

public class ListNode {
    int val;
    ListNode next;
    public ListNode(int x){
        this.val=x;
        next=null;
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //hash store the node in
        ListNode pA=headA;
        ListNode pB=headB;
        while( !pA.equals(pB)){
            pA=pA.next;
            pB=pB.next;
            if(pA==null){
                pA=headB;
            }
            if(pB==null){
                pB=headA;
            }
        }
        return pA;


    }

    public static void main(String[] args) {

    }

}
