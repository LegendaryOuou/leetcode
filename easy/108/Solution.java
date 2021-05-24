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
	内存消耗：37.7 MB, 在所有 Java 提交中击败了98.16%的用户
	*/
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = buildTree(nums,0,nums.length-1);
        return root;
    }
    private TreeNode buildTree(int[] nums,int low,int high){
        if(low>high){
            return null;
        }else{
            int mid = (low+high)/2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = buildTree(nums,low,mid-1);
            root.right = buildTree(nums,mid+1,high);
            return root;
        }
    }
}