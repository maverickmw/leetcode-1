/**
 * Remove Nth Node From End of List
 * Given a linked list, remove the nth node from the end of list and return 
 * its head.
 * 
 * For example,
 * 
 *    Given linked list: 1->2->3->4->5, and n = 2.
 * 
 *    After removing the second node from the end, the linked list becomes
 *    1->2->3->5.
 * Note:
 * Given n will always be valid.
 * Try to do this in one pass.
 * 
 * http://oj.leetcode.com/problems/remove-nth-node-from-end-of-list/
 */

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        ListNode quick = head;
        for (int i = 1; i < n; i++) quick = quick.next;
        ListNode pre = null, cur = null;
        while (quick != null) {
            pre = cur;
            if (cur == null) cur = head;
            else cur = cur.next;
            quick = quick.next;
        }
        
        if (cur == head) return head.next;
        else {
            pre.next = cur.next;
            return head;
        }
    }
}
