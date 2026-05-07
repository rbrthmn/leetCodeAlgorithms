function maxProfit(prices: number[]): number {
    let buyDay = 0
    let sellDay = buyDay + 1
    let maxProfit = 0

    for (let i = 0; i < prices.length; i++) {
        if (prices[i] < prices[buyDay]) {
            buyDay = i
        } else {
            const currentProfit = prices[i] - prices[buyDay]
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit
            }
        }
    }

    return maxProfit
};
