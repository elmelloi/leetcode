/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */

// 我反而是把右子树接到左子树的右最末端不会
class Solution {
    public void flatten(TreeNode root) {
        if (root == null)
            return;
        flatten(root.left);
        flatten(root.right);

        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = null;
        root.right = left;

        TreeNode rightEnd = root;

        while (rightEnd.right != null) {
            rightEnd = rightEnd.right;
        }

        // 思考：为什么 rightEnd = right会造成结果里右子树丢失（基本数据类型和引用类型）;
        rightEnd.right = right;
    }
}