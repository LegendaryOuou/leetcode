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
	执行用时：1 ms, 在所有 Java 提交中击败了94.79%的用户
	内存消耗：38.7 MB, 在所有 Java 提交中击败了32.37%的用户
	*/
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        List<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode node = queue.remove(0);
                if(node!=null){
                    list.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
            if(list.size()>0)
                ans.add(list);
        }
        return ans;
    }
}