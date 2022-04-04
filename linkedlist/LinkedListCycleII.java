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
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        if(head == null){
            return null;
        }
        ListNode p = head;
        while(p != null){
            if(set.contains(p)){
                return p;
            }
            set.add(p);
            p = p.next;
        }
        return null;       
    }
}