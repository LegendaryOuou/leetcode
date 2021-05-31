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
    int maxSumDepth = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        getMaxDepth(root);
        return maxSumDepth;
    }
    private int getMaxDepth(TreeNode root){
        if(root!=null) {
            int left = getMaxDepth(root.left)+1;
            int right = getMaxDepth(root.right)+1;
            maxSumDepth = Math.max(left+right,maxSumDepth);
            return Math.max(left,right);
        }
        else{
            return -1;
        }
    }
}