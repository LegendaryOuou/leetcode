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
	快慢指针
	
	执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：42.3 MB, 在所有 Java 提交中击败了27.87%的用户
	*/
    ListNode doubleTail,right=null;
    boolean res=true;
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null) return true;
        doubleTail=head;

        visit(head);
        return res;
    }
    private void visit(ListNode left){
        if(res==false) return;
        if(doubleTail!=null&&doubleTail.next!=null&&doubleTail.next.next!=null){
            doubleTail=doubleTail.next.next;
            visit(left.next);
        }
        if(right==null) {
            if(doubleTail.next==null) right=left;
            else right=left.next;
        }
        if(left.val==right.val){
            right=right.next;
        }else{
            res=false;
        }
    }
}