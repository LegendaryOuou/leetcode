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
    直接递归

    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：35.8 MB, 在所有 Java 提交中击败了74.65%的用户
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p!=null&&q!=null)
            if(p.val==q.val)
                return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
            else
                return false;
        else if(p==null&&q==null) return true;
        else return false;
    }
}