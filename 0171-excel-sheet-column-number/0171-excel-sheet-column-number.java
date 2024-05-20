class Solution {
    public int titleToNumber(String columnTitle) {
        int val = columnTitle.length();
        int ans = 0;
        for (char c : columnTitle.toCharArray()) {
            ans += Math.pow(26, val - 1) * (c - 'A' + 1);
            val--;
        }
        return ans;
    }
}