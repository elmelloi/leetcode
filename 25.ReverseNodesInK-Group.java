import java.util.ArrayList;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public ListNode reverse(ListNode head, ListNode target) {

        ListNode pre, current, next;
        pre = null;
        current = head;
        next = head;

        while (current != target) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }

        return pre;
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null)
            return head;

        ListNode a, b;
        a = b = head;

        for (int i = 0; i < k; i++) {
            if (b == null)
                return head;

            b = b.next;
        }

        ListNode newHead = reverse(a, b);
        a.next = reverseKGroup(b, k);
        return newHead;
    }
}