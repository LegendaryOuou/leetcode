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
	长的先走到和短的一样的长度，然后逐个比较就好了
	
	执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：41.1 MB, 在所有 Java 提交中击败了64.49%的用户
	*/
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA=headA,pB=headB;
        int lenA=0,lenB=0;
        while(pA!=null){
            lenA++;
            pA=pA.next;
        }
        while(pB!=null){
            lenB++;
            pB=pB.next;
        }
        pA=headA;
        pB=headB;
        if(lenA>lenB){
            for(int i=0;i<lenA-lenB;i++) pA=pA.next;
        }else{
            for(int i=0;i<lenB-lenA;i++) pB=pB.next;
        }
        while(pA!=null&&pB!=null){
            if(pA==pB) return pA;
            pA=pA.next;
            pB=pB.next;
        }
        return null;
    }
}