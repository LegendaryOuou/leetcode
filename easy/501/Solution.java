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
	执行用时：11 ms, 在所有 Java 提交中击败了6.78%的用户
	内存消耗：40.2 MB, 在所有 Java 提交中击败了13.18%的用户
	*/
    Map<Integer,Integer> map = new HashMap<>();
    public int[] findMode(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        preOrder(root);
        int max=0;
        for(int k:map.keySet()){
            max=Math.max(max,map.get(k));
        }
        for(int k:map.keySet()){
            if(map.get(k)==max)list.add(k);
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
    private void preOrder(TreeNode root){
        if(root==null) return;
        preOrder(root.left);
        if(map.containsKey(root.val)){
            map.put(root.val,map.get(root.val)+1);
        }else{
            map.put(root.val,1);
        }
        preOrder(root.right);
    }
}