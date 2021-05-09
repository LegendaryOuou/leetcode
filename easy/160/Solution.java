/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
	/*
	暴力，太慢了
	
	执行用时：780 ms, 在所有 Java 提交中击败了5.01%的用户
	内存消耗：40.9 MB, 在所有 Java 提交中击败了93.79%的用户
	*/
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        for(ListNode list1=headA;list1!=null;list1=list1.next){
            for(ListNode list2=headB;list2!=null;list2=list2.next){
                if(list1==list2) return list1;
            }
        }
        return null;
    }
	/*
	时间复杂度：O(n)
	空间复杂度：O(1)
	
	执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：41 MB, 在所有 Java 提交中击败了91.43%的用户
	*/
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA,l2 = headB;
        int len1=0,len2=0;
        while(l1!=null||l2!=null){
            if(l1!=null){
                len1++;
                l1=l1.next;
            }
            if(l2!=null){
                len2++;
                l2=l2.next;
            }
        }
        l1=headA;
        l2=headB;
        if(len1<len2){
            for(int i=0;i<len2-len1;i++){
                l2=l2.next;
            }
        }else if(len1>len2){
            for(int i=0;i<len1-len2;i++){
                l1=l1.next;
            }
        }
        while(l1!=null&&l2!=null){
            if(l1==l2) return l1;
            l1=l1.next;
            l2=l2.next;
        }
        return null;
    }
}