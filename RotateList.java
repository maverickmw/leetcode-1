/**
 * Rotate List 
 * Given a list, rotate the list to the right by k places, where k is non-negative.
 * 
 * For example:
 * Given 1->2->3->4->5->NULL and k = 2,
 * return 4->5->1->2->3->NULL.
 * 
 * http://oj.leetcode.com/problems/rotate-list/
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
    public ListNode rotateRight(ListNode head, int n) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if (head == null) return null;
        int l = 1;
        ListNode end = head;
        while (end.next != null) {
            end = end.next;
            l++;
        }
        
        n %= l;
        
        ListNode cur = head;
        for (int i = 1; i < (l - n); i++) {
            cur = cur.next;
        }
        
        end.next = head;
        head = cur.next;
        cur.next = null;
        return head;
        
    }
}
