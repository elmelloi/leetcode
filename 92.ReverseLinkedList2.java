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


// 解法1：递归解法
// 先解决前N项的问题，再解决反转一部分的问题
class Solution {

    ListNode successor = null;
    public ListNode reverseN(ListNode head,int end){

        if(head ==null || head.next == null) return head;

        if(end == 1){
            successor = head.next;
            return head;
        }
        ListNode last = reverseN(head.next,end -1);
        head.next.next = head;
        head.next = successor;
        return last;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left ==1){
            return reverseN(head,right);
        }
        head.next = reverseBetween(head.next,left-1,right-1);
        return head;
    }
}