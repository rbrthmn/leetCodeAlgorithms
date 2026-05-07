function productExceptSelf(nums: number[]): number[] {
    let result = new Array(nums.length)
    let prefix = 1
    let suffix = 1

    for (let i = 0; i < nums.length; i++) {
        if (i !== 0) {
            prefix *= nums[i - 1]
        }

        result[i] = prefix
    }

    for (let j = nums.length - 1; j >= 0; j--) {
        if (j !== nums.length - 1) {
            suffix *= nums[j + 1]
        }

        result[j] = suffix * result[j]
    }

    return result
};
