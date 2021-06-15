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
	递归一下吧
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.6 MB, 在所有 Java 提交中击败了92.82%的用户
	*/
    int len=0;
    public int getDecimalValue(ListNode head) {
        if(head==null) return -1;
        else{
            int ret = getDecimalValue(head.next);
            double res;
            if(ret==-1) res=head.val;
            else res=Math.pow(2,len)*head.val+ret;
            len++;
            return (int)res;
        }
    }
}