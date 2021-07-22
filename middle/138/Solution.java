/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
	/*
	执行用时：2 ms, 在所有 Java 提交中击败了13.89%的用户
	内存消耗：37.6 MB, 在所有 Java 提交中击败了94.70%的用户
	*/
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        List<Node> list = new LinkedList<>();
        Node pre=null;
        Node root=head;
        while(root!=null){
            Node node = new Node(root.val);
            node.next=null;
            node.random=null;
            list.add(node);
            if(pre==null) pre=node;
            else {
                pre.next=node;
                pre=node;
            }
            root=root.next;
        }
        root=head;
        for(int i=0;i<list.size();i++){
            Node node = list.get(i);
            if(root.random==null) node.random=null;
            else{
                int count=0;
                Node _head=head;
                while(root.random!=_head){
                    _head=_head.next;
                    count++;
                }
                node.random=list.get(count);
            }
            root=root.next;
        }
        return list.get(0);
    }
}