/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    
    fun reverseList(head: ListNode?): ListNode? {
        if (head == null) return null
        var curr: ListNode = head
        var next: ListNode? = head.next
        curr.next = null
        while (next != null) {
            val last = next.next
            next.next = curr
            curr = next
            next = last
        }
        return curr
    }
}
