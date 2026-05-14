function canPlaceFlowers(flowerbed: number[], n: number): boolean {
    if (flowerbed.length === 1 && flowerbed[0] === 0) return true

    for (let i = 0; i < flowerbed.length; i++) {
        if (n <= 0) break

        if (flowerbed[i] === 0) {
            if ((flowerbed[i - 1] === 0 && flowerbed[i + 1] === 0) ||
                ((flowerbed[i - 1] === undefined && flowerbed[i + 1] === 0)) ||
                ((flowerbed[i - 1] === 0 && flowerbed[i + 1] === undefined))) {
                flowerbed[i] = 1
                n--
            }
        }
    }

    return n === 0
};