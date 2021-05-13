class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return null;

        if (root.val == key) {

            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            TreeNode minNode = getMin(root.right);
            root.val = minNode.val;
            root.right = deleteNode(root.right, minNode.val);
        }

        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        }

        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        }

        return root;
    }

    TreeNode getMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}