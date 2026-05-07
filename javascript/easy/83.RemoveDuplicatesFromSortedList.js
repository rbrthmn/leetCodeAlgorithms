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
