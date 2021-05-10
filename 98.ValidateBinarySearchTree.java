// 自己的思路：用了额外的空间
// 执行用时：1 ms, 在所有 Java 提交中击败了32.29%的用户
// 内存消耗：38.1 MB, 在所有 Java 提交中击败了56.49%的用户

class Solution {
    public boolean isValidBST(TreeNode root) {
        inorderTraversal(root);
        return result;
    }

    List<Integer> res = new ArrayList();
    Boolean result = true;

    void inorderTraversal(TreeNode root) {
        if (root == null || !result)
            return;

        inorderTraversal(root.left);
        int length = res.size();
        if (length > 0) {
            int lastElement = res.get(res.size() - 1);
            if (lastElement >= root.val) {
                result = false;
            }
        }
        res.add(root.val);
        inorderTraversal(root.right);
    }
}