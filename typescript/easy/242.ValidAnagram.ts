function isAnagram(s: string, t: string): boolean {
    if (s.length !== t.length) return false

    let map = new Map()

    for (let i = 0; i < s.length; i++) {
        if (map.has(s[i])) {
            map.set(s[i], map.get(s[i]) + 1)
        } else {
            map.set(s[i], 1)
        }
    }

    for (let y = 0; y < t.length; y++) {
        if (map.has(t[y]) && map.get(t[y]) > 0) {
            map.set(t[y], map.get(t[y]) - 1)
        } else {
           return false
        }
    }

    return true
};
