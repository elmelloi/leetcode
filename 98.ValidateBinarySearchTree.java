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

// 别人的思路
// 执行用时：0 ms, 在所有 Java 提交中击败了100%的用户
// 内存消耗：37.4 MB, 在所有 Java 提交中击败了99.94%的用户

class Solution {
    boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    /* 限定以 root 为根的子树节点必须满足 max.val > root.val > min.val */
    boolean isValidBST(TreeNode root, TreeNode min, TreeNode max) {
        // base case
        if (root == null)
            return true;
        // 若 root.val 不符合 max 和 min 的限制，说明不是合法 BST
        if (min != null && root.val <= min.val)
            return false;
        if (max != null && root.val >= max.val)
            return false;
        // 限定左子树的最大值是 root.val，右子树的最小值是 root.val
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }
}