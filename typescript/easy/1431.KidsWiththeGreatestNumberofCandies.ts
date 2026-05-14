function kidsWithCandies(candies: number[], extraCandies: number): boolean[] {
    let result = []
    let max = 0

    for (let j = 0; j < candies.length; j++) {
      if (candies[j] > max) max = candies[j]
    }

    for (let i = 0; i < candies.length; i++) {
        result.push((candies[i] + extraCandies) >= max)
    }

    return result
};