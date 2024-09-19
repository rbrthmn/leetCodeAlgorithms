package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem
import br.com.rbthmn.algorithms.utils.ListNode

@Problem(141)
fun hasCycle(head: ListNode?): Boolean {
    var slow = head
    var fast = head?.next

    while (fast != null && slow != fast) {
        slow = slow!!.next
        fast = fast.next?.next
    }

    return fast != null
}
