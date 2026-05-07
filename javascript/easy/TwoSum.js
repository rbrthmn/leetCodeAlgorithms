var twoSum = function (nums, target) {
    for (let i = 0; i < nums.length - 1; i++) {
        let counter = nums[i]
        let indexes = [i]
        for (let y = i + 1; y < nums.length; y++) {
            counter += nums[y]
            indexes.push(y)

            if (counter == target) {
                return indexes
            } else {
                counter -= nums[y]
                indexes.pop()
            }
        }
    }
};