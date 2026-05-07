// Problem 27
var removeElement = function(nums, val) {
    let counter = 0
    for (let i = 0; i <= nums.length - 1; i++) {
        if (nums[i] !== val) {
            nums[counter] = nums[i]
            counter++
        }
    }
    return counter
};