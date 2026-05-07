var rotate = function (nums, k) {
    n = nums.length
    k = k % n;

    let original = [...nums]
    for (var index = 0; index <= n - 1; index++) {
        let newIndex = (index + k) % n;
        nums[newIndex] = original[index];
    }
};
