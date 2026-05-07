/**
 * Problem 70
 * 
 * @param n 
 * @returns 
 */
function climbStairs(n: number): number {
    let map = new Map()

    return fibo(n, map)
};

function fibo(n: number, memo: Map<number, number>): number {
    if (n in memo) return memo[n]
    if (n <= 2) return n

    memo[n] = fibo(n - 1, memo) + fibo(n - 2, memo)
    
    return memo[n]
}