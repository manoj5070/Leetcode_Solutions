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
    public int getDecimalValue(ListNode head) {
        int sum=0;
        int pow=0;
        List<Integer> ls=new ArrayList<>();
        while(head!=null){
            ls.add(head.val);
            head=head.next;
        }
        for(int i=ls.size()-1;i>=0;i--){
            int v=ls.get(i);
            sum+=(v*(int)Math.pow(2,pow));
            pow++;
        }
        return sum;
    }
}