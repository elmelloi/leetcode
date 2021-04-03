import java.util.Deque;
import java.util.LinkedList;

import javax.swing.tree.TreeNode;

import jdk.internal.jshell.tool.resources.l10n;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
// 解法一：递归
// class Solution {
// public List<Integer> inorderTraversal(TreeNode root) {
// List<Integer> res = new ArrayList();
// inorder(root,res);
// return res;
// }

// public void inorder(TreeNode node,List<Integer> res){
// if(node == null) return ;

// inorder(node.left);
// res.add(node.val);
// inorder(node.right);
// }

// }

// 解法2：迭代
// 执行用时：1 ms
// 内存消耗：36.7 MB

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList();
        if (root == null)
            return res;

        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;

        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            res.add(node.val);
            node = node.right;
        }

        return res;
    }
}