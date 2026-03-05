/**
 * Problem 118
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function (numRows) {
    let rows = []

    for (let i = 1; i <= numRows; i++) {
        let row = []
        for (let y = 0; y < i; y++) {
            if (y === 0 || y === i - 1) {
                row[y] = 1
            } else {
                row[y] = rows[i - 2][y - 1] + rows[i - 2][y]
            }
        }
        rows[i - 1] = row
    }

    return rows
};