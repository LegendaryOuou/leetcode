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
	直接写就好了
	
	执行用时：2 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：38.4 MB, 在所有 Java 提交中击败了97.31%的用户
	*/
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode list1 = l1,list2 = l2;
        ListNode root=null,p=null;
        int C=0;
        while(list1!=null&&list2!=null){
            int sum = list1.val+list2.val+C;
            C=sum/10;
            ListNode new_p = new ListNode(sum%10);
            if(root==null){
                root=new_p;
                p=new_p;
            }else{
                p.next=new_p;
                p=new_p;
            }
            list1=list1.next;
            list2=list2.next;
        }
        while(list1!=null){
            int sum=list1.val+C;
            C=sum/10;
            ListNode new_p = new ListNode(sum%10);
            p.next=new_p;
            p=new_p;
            list1=list1.next;
        }
        while(list2!=null){
            int sum=list2.val+C;
            C=sum/10;
            ListNode new_p = new ListNode(sum%10);
            p.next=new_p;
            p=new_p;
            list2=list2.next;
        }
        if(C==1){
            ListNode new_p = new ListNode(1);
            p.next=new_p;
            p=new_p;
        }
        p.next=null;
        return root;
    }
}