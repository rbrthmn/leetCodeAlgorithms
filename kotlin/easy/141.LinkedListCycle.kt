package easy

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun hasCycle(head: ListNode?): Boolean {
    var slow = head
    var fast = head?.next

    while (fast != null && slow != fast) {
        slow = slow!!.next
        fast = fast.next?.next
    }

    return fast != null
}
