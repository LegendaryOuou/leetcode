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
	省内存的方法
	
	执行用时：366 ms, 在所有 Java 提交中击败了16.17%的用户
	内存消耗：39 MB, 在所有 Java 提交中击败了93.67%的用户
	*/
    public ListNode removeDuplicateNodes(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode root = head;
        ListNode pre,visit=head;
        while(visit.next!=null){
            pre=head;
            while(pre!=visit.next){
                if(pre.val==visit.next.val){
                    visit.next=visit.next.next;
                    break;
                }
                pre=pre.next;
            }
            if(pre==visit.next) visit=visit.next;
        }
        return root;
    }
	/*
	内存用的也不多哈
	
	执行用时：2 ms, 在所有 Java 提交中击败了98.68%的用户
	内存消耗：38.8 MB, 在所有 Java 提交中击败了97.80%的用户
	*/
    public ListNode removeDuplicateNodes(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode root = head;
        int[] exists=new int[20000];
        exists[root.val]=1;
        while(root.next!=null){
            if(exists[root.next.val]==1){
                root.next=root.next.next;
            }else{
                exists[root.next.val]=1;
                root=root.next;
            }
        }
        return head;
    }
}