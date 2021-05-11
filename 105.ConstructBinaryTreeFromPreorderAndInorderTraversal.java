/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    TreeNode build(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd) {
        if (preStart > preEnd) {
            return null;
        }

        int rootValue = preorder[preStart];

        TreeNode root = new TreeNode(rootValue);

        int rootIndexOfInorder = -1;

        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootValue) {
                rootIndexOfInorder = i;
                break;
            }
        }
        int LeftSize = rootIndexOfInorder - inStart;

        // 做的时候，preOrderIndex因为例子的原因无法推出规则。
        root.left = build(preorder, inorder, preStart + 1, preStart + LeftSize, inStart, rootIndexOfInorder - 1);
        root.right = build(preorder, inorder, preStart + LeftSize + 1, preEnd, rootIndexOfInorder + 1, inEnd);

        return root;
    }

}