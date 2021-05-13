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
	递归就好了
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：36.5 MB, 在所有 Java 提交中击败了86.97%的用户
	*/
    List<Integer> list = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return list;
    }
    private void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            list.add(root.val);
            inorder(root.right);
        }
    }
}