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
	执行用时：1 ms, 在所有 Java 提交中击败了97.73%的用户
	内存消耗：38.5 MB, 在所有 Java 提交中击败了66.88%的用户
	*/
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        List<TreeNode> queue = new LinkedList<>();
        if(root!=null) queue.add(root);
        else return ans;
		boolean left2right=true;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> res = new LinkedList<>();
            if(left2right){
                for(int i=0;i<size;i++){
                    res.add(queue.get(i).val);
                }
            }else{
                for(int i=size-1;i>=0;i--){
                    res.add(queue.get(i).val);
                }
            }
            ans.add(res);
            for(int i=0;i<size;i++){
                TreeNode node = queue.remove(0);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            left2right=!left2right;
        }
        return ans;
    }
}