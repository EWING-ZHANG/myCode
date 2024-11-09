package interviewLeetcode.linkedList;

public class isPalindrome {
    public Boolean isPalindrome(ListNode head){
        ListNode middle = findMiddle(head);
        ListNode reverse = reverse(middle.next);
        ListNode halfStart=reverse;
        Boolean result=true;
        ListNode p1=head;
        while(!result && reverse.next!=null){
            if(reverse.val!=p1.val){
                result=false;
            }
            reverse=reverse.next;
            p1=p1.next;
        }
        reverse(halfStart);
        return result;
    }
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode pre =null;
        while(curr.next!=null){
            ListNode next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;
    }
    public ListNode findMiddle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;

    }
}
