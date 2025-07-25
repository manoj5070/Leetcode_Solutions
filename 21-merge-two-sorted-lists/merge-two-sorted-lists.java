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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3=new ListNode(0);
        ListNode temp=list3;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                list3.next=list1;
                list3=list3.next;
                list1=list1.next;
            }else{
                list3.next=list2;
                list3=list3.next;
                list2=list2.next;
            }
        }
        while(list1!=null){
            list3.next=list1;
            list1=list1.next;
            list3=list3.next;
        }
        while(list2!=null){
            list3.next=list2;
            list2=list2.next;
            list3=list3.next;
        }
        return temp.next;
    }
}