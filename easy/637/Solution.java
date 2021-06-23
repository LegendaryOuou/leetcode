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
	执行用时：3 ms, 在所有 Java 提交中击败了70.99%的用户
	内存消耗：40.3 MB, 在所有 Java 提交中击败了68.40%的用户
	*/
    public List<Double> averageOfLevels(TreeNode root) {
        List<TreeNode> treeList = new LinkedList<>();
        List<Double> list = new LinkedList<>();
        treeList.add(root);
        while(!treeList.isEmpty()){

            double sum=0;
            int size=treeList.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = treeList.remove(0);
                sum+=node.val;
                if (node!=null) {
                    if(node.left!=null) treeList.add(node.left);
                    if(node.right!=null) treeList.add(node.right);
                }
            }
            list.add(sum/size);
        }
        return list;
    }
}