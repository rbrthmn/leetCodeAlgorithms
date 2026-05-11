function lengthOfLongestSubstring(s: string): number {
    if (s.length <= 1) return s.length

    let longest = 0;
    let left = 0;
    const map = new Map<string, number>();

    for (let right = 0; right < s.length; right++) {
        const char = s[right];

        if (map.has(char) && map.get(char) >= left) {
            left = map.get(char) + 1;
        }

        map.set(char, right);
        longest = Math.max(longest, right - left + 1);
    }

    return longest;
};
