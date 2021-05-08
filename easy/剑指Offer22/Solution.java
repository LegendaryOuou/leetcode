/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    /*
    先看看有几个节点，再从头数到指定的节点返回就行

    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：36 MB, 在所有 Java 提交中击败了95.96%的用户
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        int len=0;
        ListNode p = head;
        while(p!=null){
            len++;
            p=p.next;
        }
        p=head;
        for(int i=0;i<len-k;i++){
            p=p.next;
        }
        return p;
    }

}