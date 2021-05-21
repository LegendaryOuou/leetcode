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
	分别找到左右子树的最大深度就好了
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：38.3 MB, 在所有 Java 提交中击败了73.34%的用户
	*/
    public int maxDepth(TreeNode root) {
        return getDepth(root);
    }
    private int getDepth(TreeNode root){
        if(root!=null){
            int left = getDepth(root.left)+1;
            int right = getDepth(root.right)+1;
            return Math.max(left,right);
        }
        else return 0;
    }
}