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
    public ListNode rotateRight(ListNode head, int k) {
        int n=0;
        ListNode temp1=head;
        ListNode temp3=new ListNode(0);
        while(temp1!=null){
            temp1=temp1.next;
            n++;
        }
        if(head==null || k==0 || head.next==null) return head;
        k=k%n;
        if(k==0) return head;
        int num=n-k;
        ListNode temp=temp3;
        while(num>0){
            temp3.next=head;
            head=head.next;
            temp3=temp3.next;
            num--;
        }
        ListNode temp2=head;
        temp3.next=null;
        while(head!=null && head.next!=null) head=head.next;
        head.next=temp.next;
        return temp2;
    }
}