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
	内存消耗：37.9 MB, 在所有 Java 提交中击败了53.87%的用户
	*/
    public void flatten(TreeNode root) {
        if(root==null) return;
        flatten(root.left);
        if(root.left!=null){
            TreeNode leftRoot = root.left;
            TreeNode leftBottom = root.left;
            while(leftBottom.right!=null) leftBottom=leftBottom.right;
            leftBottom.right=root.right;
            root.right=leftRoot;
            root.left=null;
            flatten(leftBottom.right);
        }else if(root.left==null){
            flatten(root.right);
        }
    }
}