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
    public ListNode removeElements(ListNode head, int val) {
        while( head!=null && head.val==val ){
            head=head.next;
        }
        if(head==null) return head;
        ListNode pre=new ListNode(0);
        ListNode temp=pre;
        
   
        while(head!=null){
            if(head.val==val){
                head=head.next;
            }else{
                pre.next=head;
                pre=pre.next;
                System.out.print(pre.val);
                head=head.next;
            }
            if(head==null){
                     pre.next=null;
                     pre=pre.next;
                     break;
            }
        }
        return temp.next;
    }
}