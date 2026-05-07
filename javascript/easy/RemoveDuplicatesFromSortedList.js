/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */

/** Problem 83
 * @param {ListNode} head
 * @return {ListNode}
 */
var deleteDuplicates = function (head) {
    var firstNode = head

    if (head) {
        while (head?.next !== null) {
            if (head?.val === head?.next?.val) {
                let headToRemove = head.next

                if (headToRemove.next == null) {
                    head.next = null
                } else {
                    head.next = headToRemove.next
                }
            } else {
                head = head.next
            }
        }
    }

    return firstNode
};
