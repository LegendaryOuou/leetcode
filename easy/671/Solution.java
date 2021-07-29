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
	内存消耗：35.3 MB, 在所有 Java 提交中击败了98.96%的用户
	*/
    int rootVal = -1;
    int secondMax = -1;
    public int findSecondMinimumValue(TreeNode root) {
        if(rootVal==-1) rootVal=root.val;
        if(root.left==null&&root.right==null) return -1;
        int left = root.left.val;
        int right = root.right.val;
        int max = Math.max(left,right);
        if(max>rootVal){
            if(secondMax==-1) secondMax=max;
            else secondMax=Math.min(max,secondMax);
        }
        findSecondMinimumValue(root.left);
        findSecondMinimumValue(root.right);
        return secondMax;
    }
}