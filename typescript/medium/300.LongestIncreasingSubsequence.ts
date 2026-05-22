function lengthOfLIS(nums: number[]): number {
    if (nums.length === 1) return 1
    
    let dp = new Array(nums.length).fill(1)
    let result = dp[0]

    for (let i = 1; i < nums.length; i++) {
        for (let j = 0; j < i; j++) {
            if (nums[j] < nums[i]) {
                dp[i] = Math.max(dp[i], dp[j] + 1)
            }
        }
        result = Math.max(result, dp[i])
    }

    return result
};