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
     public void inorder(TreeNode node,List<Integer> res){
        if(node == null) return ;

        inorder(node.left,res);
        res.add(node.val);
        inorder(node.right,res);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root,res);
        return res;
    }
}
// 解法2：迭代


