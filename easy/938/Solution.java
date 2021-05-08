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
    正常思路：当前节点为空，直接返回0；当前节点值大于区间最大值，访问左子树，当前节点值小于区间最小值，访问右子树；
    如果当前节点的值正好位于该区间内，递归访问该节点的左子树和右子树，将结果加上当前节点的值

    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：46.6 MB, 在所有 Java 提交中击败了59.32%的用户
     */
    public int rangeSumBST(TreeNode root, int low, int high) {
        while(true){
            if(root==null)
                return 0;
            else if(root.val<low)
                root=root.right;
            else if(root.val>high)
                root=root.left;
            else
                return rangeSumBST(root.left,low,high)+rangeSumBST(root.right,low,high)+root.val;
        }
    }
}