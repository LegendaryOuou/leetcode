package com.leetcode;

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
class Solution {
    /*
    后序遍历交换每棵树的左右子树

    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：35.6 MB, 在所有 Java 提交中击败了93.59%的用户
     */
    public TreeNode invertTree(TreeNode root) {
        if(root!=null){
            invertTree(root.left);
            invertTree(root.right);
            if(root.left!=null||root.right!=null){
                TreeNode p=root.left;
                root.left=root.right;
                root.right=p;
            }
        }
        return root;
    }
    /*
    也可以交换左右子树的节点值，但是可能会稍微麻烦一点
     */
}