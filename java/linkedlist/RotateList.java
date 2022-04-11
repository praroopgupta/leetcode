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
        if (head == null || k == 0 || head.next == null) {
            return head;
        }
        int size = 0;
        ListNode curr = head;
        ListNode end = null;
        List<ListNode> list = new ArrayList<>();
        while(curr != null){
            size++;
            list.add(curr);
            end = curr;
            curr = curr.next;
        } 
        if(k>size){
            k = k % size;
        }
        if(k == size || k ==0 ){
            return head;
        }
        ListNode last = list.get(size-k-1);
        ListNode first = last.next;
        last.next = null;
        ListNode temp = first;
        end.next = head;
        head = first;
        return head;
    }
}