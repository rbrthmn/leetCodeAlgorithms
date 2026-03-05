/** Problem 67
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
var addBinary = function (a, b) {
    a = a.split("").reverse().join("")
    b = b.split("").reverse().join("")
    len = a.length > b.length ? a.length : b.length
    sum = []

    for (let i = 0; i < len; i++) {
        localSum = (Number(a[i]) || 0) + (Number(b[i]) || 0) + (sum[i] || 0)

        if (localSum > 1) {
            sum[i] = localSum%2
            sum.push(1)
        } else {
            sum[i] = localSum
        }
    }

    return sum.reverse().join("")
};
