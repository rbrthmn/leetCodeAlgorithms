package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem

@Problem(88)
fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var nums1Index = m - 1
    var nums2Index = n - 1

    for (i in nums1.size - 1 downTo 0) {
        if (nums1Index >= 0 && (nums2Index < 0 || nums1[nums1Index] >= nums2[nums2Index])) {
            nums1[i] = nums1[nums1Index]
            nums1Index--
        } else {
            nums1[i] = nums2[nums2Index]
            nums2Index--
        }
    }
}
