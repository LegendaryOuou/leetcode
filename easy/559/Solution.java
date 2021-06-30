/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：38.3 MB, 在所有 Java 提交中击败了91.99%的用户
	*/
    public int maxDepth(Node root) {
        if(root == null) return 0;
        int max = 0;
        for(Node node : root.children){ //深度优先
            int count = maxDepth(node);
            if (max < count) max = count;
        }
        return max + 1;
    }
}