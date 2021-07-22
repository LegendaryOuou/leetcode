/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：37.4 MB, 在所有 Java 提交中击败了97.74%的用户
	*/
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode root=head,node=head.next,pre=null;
        boolean repeated=false;
        while(root!=null&&node!=null){
            if(root.val==node.val){
                node=node.next;
                repeated=true;
            }else if(repeated){
                root=node;
                node=node.next;
                repeated=false;
            }else break;
        }
        if(repeated&&node==null) return null;
        head=root;
        repeated=false;
        while(root!=null&&node!=null){
            if(root.val==node.val){
                node=node.next;
                repeated=true;
            }else{
                if(pre==null||(pre.next==root&&root.next==node)) {
                    pre=root;
                    root=node;
                    node=node.next;
                }else{
                    pre.next=node;
                    root=node;
                    node=node.next;
                }
                repeated=false;

            }
        }
        if(repeated&&node==null) pre.next=null;
        return head;
    }
}