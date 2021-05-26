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
	内存消耗：38.4 MB, 在所有 Java 提交中击败了96.27%的用户
	*/
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1!=null){
            if(root2!=null){
                root1.val+=root2.val;
                root1.left = mergeTrees(root1.left,root2.left);
                root1.right = mergeTrees(root1.right,root2.right);
            }
            return root1;
        }else{
            return root2;
        }
    }
}