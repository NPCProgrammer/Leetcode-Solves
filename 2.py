class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode()
        cur = dummy
                # iterate through the nodes until they dont equal anything
        
        carry = 0
        
        while l1 or l2 or carry:
            v1 = l1.val if l1 else 0 # if l1 has a value at 0, else set it to 0
            v2 = l2.val if l2 else 0 # if l2 has a value at 0, else set it to 0
        

        val = v1 + v2 + carry
            
        carry = val // 10
        val = val % 10
            
        cur.next = ListNode(val)  # I guess that just how you insert them?
            
 # update
            
        cur = cur.next
        l1 = l1.next if l1 else None
        l2 = l2.next if l2 else None
            
        return dummy.next # return the first of dummy so it return the list we made