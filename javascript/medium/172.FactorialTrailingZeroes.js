var trailingZeroes = function (n) {
    let result = 0

    while (n >= 5) {
        n /= 5
        result = Math.floor(result + n)
    }

    return result
};
