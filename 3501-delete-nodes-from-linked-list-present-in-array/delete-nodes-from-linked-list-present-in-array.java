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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums) set.add(num);

        ListNode temp=new ListNode(0);
        ListNode ans=temp;
        while(head!=null){
            int val=head.val;
            if(set.contains(val)){
                 head=head.next;
                 if(head==null) temp.next=null;
            }
            else{
                temp.next=head;
                temp=head;
                head=head.next;
                if(head==null) temp.next=null;
            }
        }
        return ans.next;
    }
}