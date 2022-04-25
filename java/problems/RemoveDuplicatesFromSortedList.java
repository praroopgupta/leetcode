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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        } 
        ListNode curr = head;
        while(curr.next != null) {
            if(curr.val == curr.next.val){
                ListNode next = curr.next.next;
                curr.next.next = null;
                curr.next = next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}