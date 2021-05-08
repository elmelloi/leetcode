class Solution {
    List<Integer> res = new LinkedList<>();

    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        inorderTraversal(root);
        return root;
    }

    void inorderTraversal(TreeNode root) {
        if (root == null)
            return;

        inorderTraversal(root.right);
        sum += root.val;
        root.val = sum;
        // 逻辑
        inorderTraversal(root.left);
    }
}