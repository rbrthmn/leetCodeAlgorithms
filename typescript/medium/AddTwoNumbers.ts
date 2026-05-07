/**
 * Problem 2
 * 
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

function addTwoNumbers(l1: ListNode | null, l2: ListNode | null): ListNode | null {
    let head = null

    let carry = 0
    while (l1 || l2 || carry > 0) {
        let sum = (l1?.val === undefined ? 0 : l1.val) + (l2?.val === undefined ? 0 : l2.val)

        if (carry > 0) {
            sum++
            carry--
        }

        const rest = sum - 10
        let newNode = new ListNode(sum, null)

        if (rest >= 0) {
            newNode = new ListNode(rest, null)
            carry++
        }

        if (!head) {
            head = newNode
        } else {
            let current = head
            while (current?.next) {
                current = current?.next;
            }
            current.next = newNode;
        }

        if (!l1?.next) {
            l1 = new ListNode(0, null)
        }

        if (!l2?.next) {
            l2 = new ListNode(0, null)
        }

        l1 = l1?.next
        l2 = l2?.next
    }

    return head
};
