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
	执行用时：11 ms, 在所有 Java 提交中击败了14.20%的用户
	内存消耗：38.5 MB, 在所有 Java 提交中击败了53.06%的用户
	*/
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = inorder.length;
        if(len==0) return null;
        TreeNode root = new TreeNode(preorder[0]);
        int index=-1;
        for (int i = 0; i < len; i++) {
            if(inorder[i]==preorder[0]){
                index=i;
                break;
            }
        }
        int[] leftPreOrder = new int[index];
        int[] rightPreOrder = new int[len-1-index];
        int[] leftInOrder = new int[index];
        int[] rightInOrder = new int[len-1-index];
        for (int i = 0; i < index; i++) {
            leftPreOrder[i]=preorder[i+1];
            leftInOrder[i]=inorder[i];
        }
        for (int i = index+1; i < len; i++) {
            rightPreOrder[i-index-1]=preorder[i];
            rightInOrder[i-index-1]=inorder[i];
        }
        root.left=buildTree(leftPreOrder,leftInOrder);
        root.right=buildTree(rightPreOrder,rightInOrder);
        return root;

    }
}