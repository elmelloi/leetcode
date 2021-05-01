
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    TreeNode build(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
        if (inStart > inEnd)
            return null;

        int rootValue = postorder[postEnd];
        TreeNode root = new TreeNode(rootValue);

        int rootIndexOfInorder = -1;

        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootValue) {
                rootIndexOfInorder = i;
            }
        }

        int leftSize = rootIndexOfInorder - inStart;
        int rightSize = inorder.length - leftSize - 1;

        root.left = build(inorder, inStart, rootIndexOfInorder - 1, postorder, postStart, postStart + leftSize - 1);
        root.right = build(inorder, rootIndexOfInorder + 1, inEnd, postorder, postStart + leftSize, postEnd - 1);
        return root;
    }
}