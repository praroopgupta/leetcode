/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        Set<ListNode> set = new HashSet<>();
        ListNode a = headA;
        while(a != null){
            set.add(a);
            a = a.next;
        }
        ListNode b = headB;
        while(b != null){           
            if(set.contains(b)){
                return b;
            }
            b = b.next;
        }
        return null;
    }
}