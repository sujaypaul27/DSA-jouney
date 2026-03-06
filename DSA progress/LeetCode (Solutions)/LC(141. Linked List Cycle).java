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
    public boolean hasCycle(ListNode head) {
        
        if(head == null || head.next == null) return false;

        ListNode slow = head;// slow pointer
        ListNode fast = head;// fast pointer

        while(fast != null && fast.next != null){// while fast pointer and its next are not null
            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps

            if(slow == fast){// pointers meet
                return true;           // cycle detected
            }
        }

        return false;                  // no cycle
    }
}