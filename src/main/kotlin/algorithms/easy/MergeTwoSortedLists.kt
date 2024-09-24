package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem
import br.com.rbthmn.algorithms.utils.ListNode

@Problem(21)
fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    if (list1 == null && list2 == null) return null
    if (list1 == null) return list2
    if (list2 == null) return list1
    if (list1.`val` < list2.`val`) {
        list1.next = mergeTwoLists(list1.next, list2)
        return list1
    }
    list2.next = mergeTwoLists(list2.next, list1)
    return list2
}
