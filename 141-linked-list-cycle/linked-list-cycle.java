/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;
        ListNode nexth=head.next;
        while(head!=null && nexth.next!=null){
            if(head==nexth) return true;
            head=head.next;
            nexth=nexth.next.next;
            if(head==null || nexth==null) return false;
        }
        return false;
    }
}