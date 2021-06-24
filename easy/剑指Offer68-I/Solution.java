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
	感觉挺难的，怎么通过率这么高？
	经过归纳，可以发现目标节点target有以下特点(假设p.val<=q.val)：
	p.val<=target.val<=q.val
	同时可以确定这样的节点是唯一的
	那么接下来就简单了，对每个节点这样判断一下就好了。
	
	执行用时：6 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：39 MB, 在所有 Java 提交中击败了71.22%的用户
	*/
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if((root.val>=p.val&&root.val<=q.val)||(root.val<=p.val&&root.val>=q.val)) return root;
        if(root.left!=null){
            TreeNode res = lowestCommonAncestor(root.left,p,q);
            if(res!=null) return res;
        }
        if(root.right!=null){
            TreeNode res = lowestCommonAncestor(root.right,p,q);
            if(res!=null) return res;
        }
        return null;
    }
}