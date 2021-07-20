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
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：37.5 MB, 在所有 Java 提交中击败了99.01%的用户
	*/
    boolean ans=true;
    TreeNode pre = null;
    public boolean isValidBST(TreeNode root) {
        check(root);
        return ans;
        
    }
    private void check(TreeNode root){
        if(ans==false) return;
        if(root==null) return;
        if(root.left!=null){
            check(root.left);
        }
        if(pre==null) pre=root;
        else{
            if(pre.val>=root.val){
                ans=false;
            }
            pre=root;
        }
        if(root.right!=null){
            check(root.right);
        }
    }
}