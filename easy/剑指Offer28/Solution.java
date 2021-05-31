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
	递归简单，好像树大部分用递归都挺简单的
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：36.4 MB, 在所有 Java 提交中击败了65.54%的用户
	*/
    boolean res = true;
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return res;
        compareTree(root.left,root.right);
        return res;
    }
    private void compareTree(TreeNode left,TreeNode right){
        if(res==false) return;
        if(left==null&&right==null){
            return;
        }else if(left!=null&&right!=null&&left.val==right.val){
            compareTree(left.left,right.right);
            compareTree(left.right,right.left);
        }else{
            res = false;
        }
    }
}