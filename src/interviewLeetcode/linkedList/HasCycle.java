package interviewLeetcode.linkedList;

import java.util.HashSet;

public class HasCycle {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode curr=head;
        while(curr!=null && !set.contains(curr)){
            set.add(curr);
        }
        if(curr==null){
            return false;
        }else{
            return true;
        }

    }
}
