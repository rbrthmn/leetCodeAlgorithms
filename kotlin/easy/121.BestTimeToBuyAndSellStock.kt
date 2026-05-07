package easy

fun maxProfit(prices: IntArray): Int {
    var bestPriceToBuy = prices.first()
    var bestProfit = 0

    for (index in prices.indices) {
        if (prices[index] < bestPriceToBuy) {
            bestPriceToBuy = prices[index]
        }

        val currentProfit = prices[index] - bestPriceToBuy
        if (bestProfit < currentProfit) {
            bestProfit = currentProfit
        }
    }

    return bestProfit
}
