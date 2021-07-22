/**
 * Definition for singly-linked list.
 * class ListNode {
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
	O(1)的空间复杂度
	
	执行用时：148 ms, 在所有 Java 提交中击败了5.34%的用户
	内存消耗：38.3 MB, 在所有 Java 提交中击败了87.65%的用户
	*/
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode node1 = head,node2 = head.next;
        int len1=1,len2=2;
        while(node2!=null&&node2.next!=null&&node1!=node2){
            node1=node1.next;
            len1++;
            node2=node2.next.next;
            len2+=2;
        }
        if(node1!=node2) return null;
        System.out.println(len1);
        node1 = head;
        node2 = head.next;
        int count=0;
        while(node1!=node2){
            node2=node2.next;
            count++;
            if(count>len1){
                node1=node1.next;
                node2=node1.next;
                count=0;
            }
        }
        return node1;
    }
	/*
	O(n)时间,O(n)空间
	
	执行用时：264 ms, 在所有 Java 提交中击败了5.34%的用户
	内存消耗：38.4 MB, 在所有 Java 提交中击败了70.13%的用户
	*/
	public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        List<ListNode> list = new LinkedList<>();
        while(head!=null&&!list.contains(head)){
            list.add(head);
            head=head.next;
        }
        return head;
    }
}