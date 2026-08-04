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
        if (head == null) return null;
        ListNode temp = head;
        int counta = 0;
        
        while (temp != null) {
            counta++;
            temp = temp.next;
        }
        
        temp = head;
        int tar = counta - n;
        
        if (tar == 0)
            return head.next;
        
        for (int i = 0; i < tar - 1; i++) {
            temp = temp.next;
        }
        
        temp.next = temp.next.next;
        return head;
    }
}