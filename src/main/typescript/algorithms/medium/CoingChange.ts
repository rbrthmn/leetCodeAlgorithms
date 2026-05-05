/**
 * Problem 322
 * 
 * @param coins 
 * @param amount 
 * @returns 
 */
function coinChange(coins: number[], amount: number): number {
    let map = new Map()

    return subtractAmount(coins, amount, map)
};

function subtractAmount(coins: number[], amount: number, map: Map<number, number>): number {
    if (amount === 0) return 0
    let result = -1

    if (map.has(amount)) {
        result = map.get(amount)
    } else {
        for (let i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                const rest = amount - coins[i]
                const minimumRemainder = subtractAmount(coins, rest, map)

                if (minimumRemainder !== -1) {
                    if (result === -1) {
                        result = 1 + minimumRemainder
                    } else {
                        result = Math.min(result, 1 + minimumRemainder)
                    }
                }
            }
        }
        map.set(amount, result)
    }


    return result
}