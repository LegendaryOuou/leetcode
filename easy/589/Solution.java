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
	执行用时：1 ms, 在所有 Java 提交中击败了92.69%的用户
	内存消耗：39.5 MB, 在所有 Java 提交中击败了16.10%的用户
	*/
    List<Integer> list = new LinkedList<>();
    public List<Integer> preorder(Node root) {
        if(root==null) return list;
        preOrderTraverse(root);
        return list;
    }
    private void preOrderTraverse(Node root){
        list.add(root.val);
        List<Node> son = root.children;
        for(int i=0;i<son.size();i++){
            preOrderTraverse(son.get(i));
        }
    }
}