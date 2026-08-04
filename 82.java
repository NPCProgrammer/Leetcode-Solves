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
        // get rid of duplicates. loop thru entire list, cur.val == curr.next.value then delete it
        ListNode start = new ListNode(0, head);
        ListNode prev = start, curr = head; 

        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                while (curr != null && curr.next != null && curr.val == curr.next.val){
                     curr.next = curr.next.next;
                }
                
                prev.next = curr.next;
                curr = curr.next;
            }
            else {
                prev = curr;
                curr = curr.next;
            }
        }
        return start.next;
    }
}