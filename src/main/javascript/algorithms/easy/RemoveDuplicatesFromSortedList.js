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

    if (head) {
        while (head?.val !== val) {
            if (head.val === val) {
                if (startNode.val === head.val) {
                    startNode = head.next
                }

                if (head?.next?.next === null) {
                    head.next = null
                }  else {
                    head = head?.next?.next
                }
            } else {
                head = head.next
            }
        }
    }