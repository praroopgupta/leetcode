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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> list = new ArrayList<>();
        ListNode start = head;
        while(start != null) {
            list.add(start);
            System.out.print(start.val + " ");
            start = start.next;
        }
        int size = list.size();
        if(n > size){
            return head;
        }
        int del = size - n;
        if(del < 0){
            return null;
        }
        if(del == 0){
            return head.next;
        }
        System.out.println();
        System.out.print("Index To Be Deleted: "+del);
        ListNode i = head;
        for(int j=0; j<del-1; j++){
            i = i.next;
        }
        i.next = i.next.next;
        return head;
    }
}