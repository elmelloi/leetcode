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
class Solution {
     public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
            ListNode last = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return last;
    }
}