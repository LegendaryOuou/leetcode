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
	两个思路的结合：二叉树的中序遍历、查询有序数组两元素差的最小值
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：37.9 MB, 在所有 Java 提交中击败了89.57%的用户
	*/
    int pre=-1;
    int min=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        midTraverse(root);
        return min;
    }
    private void midTraverse(TreeNode root){
        if(root!=null){
            midTraverse(root.left);
            if(pre==-1)pre=root.val;
            else {
                min=Math.min(min,root.val-pre);
                pre=root.val;
            }
            midTraverse(root.right);
        }
    }
}