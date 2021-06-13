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
	有点耗内存了
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：36.2 MB, 在所有 Java 提交中击败了33.28%的用户
	*/
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		List<Integer> list1 = new LinkedList<>();
		List<Integer> list2 = new LinkedList<>();
		getLeafList(root1,list1);
		getLeafList(root2,list2);
		int len1=list1.size(),len2=list2.size();
		if(len1!=len2) return false;
		for(int i=0;i<len1;i++){
			if(list1.get(i)!=list2.get(i)) return false;
		}
		return true;
    }
	private void getLeafList(TreeNode root,List list){
		if(root.left==null&&root.right==null) list.add(root.val);
		else if(root.right==null) getLeafList(root.left,list);
		else if(root.left==null) getLeafList(root.right,list);
		else{
			getLeafList(root.left,list);
			getLeafList(root.right,list);
		}
	}
}