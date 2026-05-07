/**
 * Problem 191
 * 
 * @param n 
 * @returns 
 */
function hammingWeight(n: number): number {
    let counter = 0
    const binary = n.toString(2)
    for (const bit of binary) {
        if (bit === "1") counter++
    }

    return counter
};
