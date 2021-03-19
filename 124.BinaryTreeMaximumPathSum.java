// 递归解法占用内存大
class Solution {
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return maxSum;
    }

    public int maxPath(TreeNode node){
        if(node == null){
            return 0;
        }
        int nodeValue = node.val;
        int left = Math.max(0,maxPath(node.left));
        int right = Math.max(0,maxPath(node.right));
        maxSum = Math.max(maxSum,left + right + nodeValue);
        return Math.max(left,right) + nodeValue;
    }
}