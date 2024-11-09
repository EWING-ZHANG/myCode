package interviewLeetcode.linkedList;

public class Inverse {
    public ListNode reverseList(ListNode head) {
        ListNode pre=head;
        while(head!=null){
            head = head.next;
            ListNode temp =head;
            head.next=pre;
            pre = temp;
        }
        return pre;

    }
}
