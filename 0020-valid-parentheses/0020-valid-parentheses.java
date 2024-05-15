class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        boolean ans = true;
        strLoop : for (char c : s.toCharArray() ) {
            switch (c) {
                case ')':
                    if (stack.isEmpty() || stack.peek() != '(') {
                        ans = false;
                        break strLoop;
                    }
                    stack.pop();
                    break;
                case '}':
                    if (stack.isEmpty() || stack.peek() != '{') {
                        ans = false;
                        break strLoop;
                    }
                    stack.pop();
                    break;
                case ']':
                    if (stack.isEmpty() || stack.peek() != '[') {
                        ans = false;
                        break strLoop;
                    }
                    stack.pop();
                    break;
                default:
                    stack.push(c);
            }
        }

        if (!stack.isEmpty()) {
            ans = false;
        }
        return ans;
    }
}