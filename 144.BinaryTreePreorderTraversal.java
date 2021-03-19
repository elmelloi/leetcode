/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// 解法1：递归
// 时间：0ms，内存：37MB
class Solution {
    public List<Integer> preOrder(TreeNode root,List<Integer> result) {
        if(root == null){
            return new ArrayList<Integer>();
        }
        result.add(root.val);
        List<Integer> left = preOrder(root.left,result);
        List<Integer> right = preOrder(root.right,result);
        return result;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrder(root,result);
        return result;
    }
}

// 解法2：迭代


