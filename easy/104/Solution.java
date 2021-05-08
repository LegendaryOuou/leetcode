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
    直接递归，一次过

    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：38.3 MB, 在所有 Java 提交中击败了82.50%的用户
     */
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        else{
            int leftmax=maxDepth(root.left);
            int rightmax=maxDepth(root.right);
            return (leftmax>rightmax?leftmax:rightmax)+1;
        }
    }
}