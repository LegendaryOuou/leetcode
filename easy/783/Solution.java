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
	完了，正儿八经的递归都写不出来了
	
	执行用时：1 ms, 在所有 Java 提交中击败了28.21%的用户
	内存消耗：35.9 MB, 在所有 Java 提交中击败了82.26%的用户
	*/
    List<Integer> list = new LinkedList<>();
    public int minDiffInBST(TreeNode root) {
        visit(root);
        int min=100000;
        for(int i=1;i<list.size();i++){
            min=Math.min(list.get(i)-list.get(i-1),min);
        }
        return min;
    }
    private void visit(TreeNode root){
        if(root!=null){
            if(root.left!=null)visit(root.left);
            list.add(root.val);
            if(root.right!=null) visit(root.right);
        }
    }
	/*
	看了别人写的才会，哎。。。
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.9 MB, 在所有 Java 提交中击败了87.57%的用户
	*/
	int pre=-1;
    int min=100000;
    public int minDiffInBST(TreeNode root) {
        visit(root);
        return min;
    }
    private void visit(TreeNode root){
        if(root==null) return;
        visit(root.left);
        if(pre<0) pre=root.val;
        else{
            min=Math.min(min,root.val-pre);
            pre=root.val;
        }
        visit(root.right);
    }
}