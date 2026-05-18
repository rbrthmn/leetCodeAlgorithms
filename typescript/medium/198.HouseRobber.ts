function rob(nums: number[]): number {
    if (nums.length === 1) return nums[0]

    let dp = new Array(nums.length).fill(0)
    dp[0] = nums[0]
    dp[1] = Math.max(nums[0], nums[1])

    for (let i = 2; i < nums.length; i++) {
        if (dp[i - 1] < dp[i - 2] + nums[i]) {
            dp[i] = dp[i - 2] + nums[i]
        } else {
            dp[i] = dp[i - 1]
        }
    }

    return dp.pop()
};