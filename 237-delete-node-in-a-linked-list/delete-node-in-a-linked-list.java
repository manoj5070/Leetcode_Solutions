/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
       ListNode temp=node;
       ListNode pre=node;
       while(temp!=null && temp.next!=null){
            int val=temp.val;
            temp.val=temp.next.val;
            temp.next.val=val;
            pre=temp;
            temp=temp.next;
       }
       pre.next=null;
    }
}