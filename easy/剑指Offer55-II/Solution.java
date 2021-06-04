/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
	/*
	一个简单的小递归
	
	执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：38.4 MB, 在所有 Java 提交中击败了69.31%的用户
	*/
    boolean res = true;
    public boolean isBalanced(TreeNode root) {
        fun(root);
        return res;
    }
    private int fun(TreeNode root){
        if(res==false) return 0;
        if(root==null) return 0;
        else{
            int left = fun(root.left)+1;
            int right = fun(root.right)+1;
            if(Math.abs(left-right)>1) res=false;
            return Math.max(left,right);
        }
    }
}