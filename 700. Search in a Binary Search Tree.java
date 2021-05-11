/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */

// 自己的思路
// 执行用时：0 ms, 在所有 Java 提交中击败了100%的用户
// 内存消耗：39.3 MB, 在所有 Java 提交中击败了65.22%的用户
class Solution {

    TreeNode target;

    public TreeNode searchBST(TreeNode root, int val) {
        binarySearch(root, val);
        return target;
    }

    void binarySearch(TreeNode root, int val) {
        if (root == null)
            return;
        if (root.val == val) {
            target = root;
            return;
        }

        if (root.val > val) {
            binarySearch(root.left, val);
            return;
        }

        if (root.val < val) {
            binarySearch(root.right, val);
            return;
        }

    }

}