/**
 * Problem 441
 * @param {number} n
 * @return {number}
 */
var arrangeCoins = function (n) {
    let left = 1, right = n

    while (left <= right) {
        const mid = Math.floor((left + right) / 2)
        const numCoins = (mid * (mid + 1)) / 2

        if (numCoins === n) return mid
        else if (numCoins < n) left = mid + 1
        else right = mid - 1

    }

    return left - 1
};
