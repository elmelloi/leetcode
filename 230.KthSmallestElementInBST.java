/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */

// 因为没法自定义TreeNode的结构，目前只能实现 O(N)的解法
class Solution {

    int rank = 0;
    int res = 0;

    public int kthSmallest(TreeNode root, int k) {
        inorderTraversal(root, k);
        return res;
    }

    void inorderTraversal(TreeNode root, int k) {
        if (root == null)
            return;
        inorderTraversal(root.left, k);
        rank++;
        if (k == rank) {
            res = root.val;
            return;
        }
        inorderTraversal(root.right, k);
    }
}