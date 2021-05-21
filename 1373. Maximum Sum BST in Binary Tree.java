class Solution {

    int maxSum = 0;

    public int maxSumBST(TreeNode root) {
        traverse(root);
        return maxSum;
    }

    // 数组第一个数字表示是不是BST；如果不是是BST，其他三位都是空的；
    // 如果是BST，第二个是BST里的最小值；第三个BST里的最大值；第四个是BST所有值之和
    int[] traverse(TreeNode root) {
        if (root == null)
            return new int[] { 1, Integer.MAX_VALUE, Integer.MIN_VALUE, 0 };

        int[] left = traverse(root.left);
        int[] right = traverse(root.right);

        int[] res = new int[4];

        if (left[0] == 1 && right[0] == 1 && root.val > left[2] && root.val < right[1]) {

            res[0] = 1;
            res[1] = Math.min(left[1], root.val);
            res[2] = Math.max(right[2], root.val);
            res[3] = root.val + left[3] + right[3];
            maxSum = Math.max(maxSum, res[3]);

        } else {
            res[0] = 0;
        }
        return res;
    }

}
