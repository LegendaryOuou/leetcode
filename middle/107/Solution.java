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
	执行用时：1 ms, 在所有 Java 提交中击败了98.30%的用户
	内存消耗：38.5 MB, 在所有 Java 提交中击败了74.08%的用户
	*/
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new LinkedList<>();
        if(root!=null) queue.add(root);
        else return ans;
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> res = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove(0);
                res.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            ans.add(0,res);
        }
        return ans;
    }
}