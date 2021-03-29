/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */

// 解法1：递归解法
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}

// 解法2：迭代解法

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre, current, next;
        pre = null;
        current = head;
        next = head;

        while (current != null) {
            next = current.next;

            current.next = pre;

            pre = current;
            current = next;
        }

        return pre;
    }
}
