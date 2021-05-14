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
	递归一下
	
	执行用时：1 ms, 在所有 Java 提交中击败了99.99%的用户
	内存消耗：38.4 MB, 在所有 Java 提交中击败了80.62%的用户
	*/
    boolean res = true;
    public boolean isBalanced(TreeNode root) {
        check(root);
        return res;
    }
    private int check(TreeNode root){
        if(res==false) return 0;
        if(root!=null){
            int left = check(root.left)+1;
            int right = check(root.right)+1;
            if(Math.abs(left-right)>1) res=false;
            return left>right?left:right;
        }else{
            return 0;
        }
    }
}