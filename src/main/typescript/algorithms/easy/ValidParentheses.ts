/**
 * Problem 20
 * @param s 
 * @returns 
 */
function isValid(s: string): boolean {
    let stack = []

    for (let i = 0; i < s.length; i++) {
        switch (s[i]) {
            case '[':
            case '(':
            case '{':
                stack.push(s[i])
                break
            case ']':
                if (stack.pop() !== '[') return false
                break
            case ')':
                if (stack.pop() !== '(') return false
                break
            case '}':
                if (stack.pop() !== '{') return false
                break
        }
    }

    return stack.length === 0
};