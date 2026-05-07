/**
 * Problem 1136
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function (nums) {
    if (nums.length === 1) return nums[0]

    let result = nums[0]

    for (let i = 1; i < nums.length; i++) {
        result = result ^ nums[i]
    }

    return result
};