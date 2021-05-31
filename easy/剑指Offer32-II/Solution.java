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
	Map保存每一层的节点值，最后转移到List中
	
	执行用时：1 ms, 在所有 Java 提交中击败了94.74%的用户
	内存消耗：38.5 MB, 在所有 Java 提交中击败了76.66%的用户
	*/
    Map<Integer,List<Integer>> map = new HashMap<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        level(root,0);
        List<List<Integer>> list = new LinkedList<>();
        for(int item:map.keySet()){
            list.add(map.get(item));
        }
        return list;
    }
    private void level(TreeNode root,int k){
        if(root==null) return;
        if(!map.containsKey(k)){
            List<Integer> list = new LinkedList<>();
            list.add(root.val);
            map.put(k,list);
        }else{
            map.get(k).add(root.val);
        }
        level(root.left,k+1);
        level(root.right,k+1);
    }
}