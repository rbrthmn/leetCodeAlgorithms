/** Problem 189
 * 
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function (nums, k) {
    n = nums.length
    k = k % n;
    
    let original = [...nums]
    for (var index = 0; index <= n - 1; index++) {
        let newIndex = (index + k) % n;
        nums[newIndex] = original[index];
    }
};