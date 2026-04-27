/**
 * Problem 733
 * 
 * @param {number[][]} image
 * @param {number} sr
 * @param {number} sc
 * @param {number} color
 * @return {number[][]}
 */
var floodFill = function (image, sr, sc, color) {
    const oldColor = image[sr][sc]

    if (oldColor === color) return image

    let queue = [[sr, sc]]
    let head = 0

    while (queue.length > head) {
        const [y, x] = queue[head++]

        image[y][x] = color

        if (image[y + 1] && image[y + 1][x] === oldColor) {
            queue.push([y + 1, x])
        }

        if (image[y - 1] !== undefined && image[y - 1][x] === oldColor) {
            queue.push([y - 1, x])
        }

        if (image[y][x + 1] !== undefined && image[y][x + 1] === oldColor) {
            queue.push([y, x + 1])
        }

        if (image[y][x - 1] !== undefined && image[y][x - 1] === oldColor) {
            queue.push([y, x - 1])
        }
    }

    return image
};