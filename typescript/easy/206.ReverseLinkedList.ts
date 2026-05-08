/**
 * Definition for singly-linked list.
 * class ListNode {
 *     val: number
 *     next: ListNode | null
 *     constructor(val?: number, next?: ListNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.next = (next===undefined ? null : next)
 *     }
 * }
 */

function reverseList(head: ListNode | null): ListNode | null {
    let i = head
    let lastNode = null

    while (i) {
        const node = new ListNode(i.val, lastNode)
        if (i.next) {
            lastNode = node
        } else {
            return node
        }
        i = i.next
    }

    return head
};