/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        } 
        ListNode pre=slow.next;
        slow.next=null;
        while(pre!=null){
            ListNode next=pre.next;
            pre.next=slow;
            slow=pre;
            pre=next;
        }

        while(slow!=null){
            if(slow.val!=head.val) return false;
            slow=slow.next;
            head=head.next;
        }



        // ListNode rev=new ListNode(0);
        // ListNode curr=rev;
        // reverse(head,rev.next);
        // curr=curr.next;
        // while(curr!=null){
        //     if(curr.val!=pre.val) return false;
        //     curr=curr.next;
        //     rev=rev.next;
        // }
        return true;

    }
    // private void reverse(ListNode head,ListNode rev){
    //     if(head==null) return ;
    //     reverse(head.next,rev);
    //     rev.next=head;
    //     rev=rev.next;
    // }
}