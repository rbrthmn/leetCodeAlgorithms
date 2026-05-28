function findMin(nums: number[]): number {
    if (nums.length === 2) return Math.min(nums[0], nums[1])

    const left = 0
    const right = nums.length - 1
    const middle = Math.floor(nums.length / 2)

    if (nums[middle] > nums[right]) {
        const upperHalf = nums.slice(middle + 1, nums.length)
        return findMin(upperHalf)
    }

    if (nums[middle] < nums[left]) {
        const lowerHalf = nums.slice(0, middle + 1)
        return findMin(lowerHalf)
    }

    return nums[left]
};
