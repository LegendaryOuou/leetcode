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
	递归1
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.9 MB, 在所有 Java 提交中击败了92.38%的用户
	*/
    int num = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        countLeft(root,'N');
        return num;
    }
    private void countLeft(TreeNode root,char from){
        if(root==null) return;
        if(root.left==null&&root.right==null){
            if(from=='L') num+=root.val;
        }else{
            countLeft(root.left,'L');
            countLeft(root.right,'R');
        }
    }
	/*
	递归2
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.8 MB, 在所有 Java 提交中击败了98.27%的用户
	*/
	public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        if(root.left!=null&&root.left.left==null&&root.left.right==null){
            return root.left.val+sumOfLeftLeaves(root.right);
        }else{
            return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
        }
    }
}