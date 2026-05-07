/**
 * Problem 53
 * @param nums 
 * @returns 
 */
function maxSubArray(nums: number[]): number {
    if (nums.length === 1) return nums[0]

    let maxSum = nums[0]
    let acc = 0

    for (let i = 0; i < nums.length; i++) {
        if (acc < 0) {
            acc = nums[i]
        } else {
            acc += nums[i]
        }

        if (acc > maxSum) {
            maxSum = acc
        } 
    }

    return maxSum
};