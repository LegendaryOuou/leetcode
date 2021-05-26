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
	直接合并
	
	执行用时：1 ms, 在所有 Java 提交中击败了99.28%的用户
	内存消耗：38.4 MB, 在所有 Java 提交中击败了83.65%的用户
	*/
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode root=null,p1=null;
        while(l1!=null&&l2!=null){
            if(root==null){
                if(l1.val<l2.val){
                    root=l1;
                    p1=l1;
                    l1=l1.next;
                }else{
                    root=l2;
                    p1=l2;
                    l2=l2.next;
                }
            }else{
                if(l1.val<l2.val){
                    p1.next=l1;
                    l1=l1.next;
                }else{
                    p1.next=l2;
                    l2=l2.next;
                }
                p1=p1.next;
            }
        }
        if(l1!=null){
            p1.next=l1;
        }else{
            p1.next=l2;
        }
        return root;
    }
	/*
	递归
	
	执行用时：1 ms, 在所有 Java 提交中击败了99.28%的用户
	内存消耗：38.4 MB, 在所有 Java 提交中击败了79.38%的用户
	*/
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        return merge(l1,l2);
    }
    private ListNode merge(ListNode l1,ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val<l2.val){
            l1.next = merge(l1.next,l2);
            return l1;
        }else{
            l2.next = merge(l1,l2.next);
            return l2;
        }
    }
	/*
	改进版递归
	*/
}