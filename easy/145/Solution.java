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
	后序遍历
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：36.5 MB, 在所有 Java 提交中击败了92.81%的用户
	*/
    List<Integer> list = new LinkedList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postTravel(root);
        return list;
    }
    private void postTravel(TreeNode root){
        if(root!=null){
            postTravel(root.left);
            postTravel(root.right);
            list.add(root.val);
        }
    }
}