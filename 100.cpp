Kearnan submitted at Jul 31, 2026 16:17
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
  *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */


class Solution {
public:


    void helper(TreeNode* p, TreeNode* q, bool& result){
        if (p == nullptr && q == nullptr) {
            // they both ended, still could be equal so just return
            return;
        }

        if (p == nullptr || q == nullptr || p->val != q->val) {
            result = false;
            return;
            // still gotta return or will go outta bounds
        }

        
        helper(p->left, q->left, result);
        // now right
        helper(p->right, q->right, result);
        // now is it right?
    }

    bool isSameTree(TreeNode* p, TreeNode* q) {
        /** imma just do inorder through one tree and then compare to exact same scenario of other tree and see if self.val the same type shit. Also C++ cus i can.
        */
        // base case:

        bool result = true;
        //check left all the way
        helper(p, q, result);
        // now is it right?
        return result;
    }

    
};