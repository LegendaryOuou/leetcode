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
	递归
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：38.2 MB, 在所有 Java 提交中击败了83.30%的用户
	*/
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        if(targetSum==root.val&&root.left==null&&root.right==null){
            return true;
        }else{
            return hasPathSum(root.left,targetSum-root.val)||hasPathSum(root.right,targetSum-root.val);
        }
    }
}