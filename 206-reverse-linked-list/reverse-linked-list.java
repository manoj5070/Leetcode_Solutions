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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head; 
     ListNode pre=head;   
     ListNode curr=head.next;
     ListNode next=head.next.next;
     pre.next=null;
     curr.next=pre;
     if(next==null) return curr;
    //  next.next=curr;
        while(pre!=null){
            pre=next.next;
            next.next=curr;
            curr=next;
            next=pre;
        }
        return curr;
    }
}