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
	反向中序遍历：右->中->左
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：38.1 MB, 在所有 Java 提交中击败了87.01%的用户
	*/
    int count=0;
    public int kthLargest(TreeNode root, int k) {
        if(root==null) return -1;
        int left = kthLargest(root.right,k);
        if(left!=-1) return left;
        count++;
        if(count==k){
            return root.val;
        }
        int right = kthLargest(root.left,k);
        if(right!=-1) return right;
        return -1;
    }
}