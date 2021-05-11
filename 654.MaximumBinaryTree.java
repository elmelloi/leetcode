/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {

    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return build(nums, 0, nums.length - 1);
    }

    public TreeNode build(int[] arr, int start, int end) {
        if (start > end)
            return null;

        int index = -1;
        int maxVal = Integer.MIN_VALUE;

        // 因为写成 i < end,排查20分钟。
        for (int i = start; i <= end; i++) {
            int itemValue = arr[i];
            if (itemValue > maxVal) {
                maxVal = itemValue;
                index = i;
            }
        }

        TreeNode root = new TreeNode(maxVal);
        root.left = build(arr, start, index - 1);
        root.right = build(arr, index + 1, end);

        return root;
    }
}