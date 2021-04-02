import java.util.Deque;
import java.util.LinkedList;

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */

// 解法1：递归
// 时间：0ms，内存：37MB

// class Solution {
// public void inorder(TreeNode node, List<Integer> res) {
// if (node == null)
// return;

// inorder(node.left, res);
// res.add(node.val);
// inorder(node.right, res);
// }

// public List<Integer> inorderTraversal(TreeNode root) {
// List<Integer> res = new ArrayList<>();
// inorder(root, res);
// return res;
// }
// }

// 解法2：迭代
// 时间：1ms，内存：37MB

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList();

        if (root == null)
            return res;

        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;
        node = root;

        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                res.add(node.val);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }

        return res;
    }
}
