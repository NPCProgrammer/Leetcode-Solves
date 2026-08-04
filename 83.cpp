/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

 class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        if (!head) return nullptr;
        std::set<int> lis;

        ListNode* curr = head;
        while (curr != nullptr) {
            lis.insert(curr->val);
            curr = curr->next;
        }

        curr = head;
        ListNode* prev = nullptr;
        for (int val : lis) {
            curr->val = val;
            prev = curr;
            curr = curr->next;
        }

        prev->next = nullptr;

        return head;
    }
};