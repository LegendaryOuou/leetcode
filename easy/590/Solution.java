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
	内存消耗：39.6 MB, 在所有 Java 提交中击败了5.18%的用户
	*/
    List<Integer> ans = new LinkedList<>();
    public List<Integer> postorder(Node root) {
        visit(root);
        return ans;
    }
    private void visit(Node root){
        if(root==null) return;
        List<Node> list = root.children;
        int size = list.size();
        for(int i=0;i<size;i++){
            Node node = list.get(i);
            visit(node);
        }
        ans.add(root.val);
    }
}