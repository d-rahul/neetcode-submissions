/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {

    fun reverseList(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var curr = head
        while (curr != null) {
            val next = curr.next   // 1. save the rest
            curr.next = prev       // 2. reverse the arrow
            prev = curr            // 3. move prev forward
            curr = next            // 4. move curr forward
        }
        return prev
    }
    
    /*fun reverseList(head: ListNode?): ListNode? {
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
    }*/
}
