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
    思路一：递归
        将树从中间劈开，对左右两侧的子树递归，每次递归左右两侧的子树应该是对称的
            这里的对称意思是每颗子树的根节点值相同，左子树的左子树和右子树的右子树、以及左子树的右子树和右子树的左子树值相等或都为空
    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：36.2 MB, 在所有 Java 提交中击败了91.71%的用户
     */
    public boolean isSymmetric(TreeNode root) {
        return check(root.left,root.right);
    }
    private boolean check(TreeNode t1, TreeNode t2){
        if((t1==null&&t2!=null)||(t1!=null&&t2==null)) return false;
        // 这里可以简化的原因是，t1、t2为空与否共有四种情况，上一个if考虑了两种，一空一非空，只剩下都空和都非空，
        // 所以这里只要t1为空，t2一定为空
        if(t1 == null) return true;
        if(t1.val==t2.val) return check(t1.left,t2.right)&&check(t1.right,t2.left);
        else return false;
    }
}