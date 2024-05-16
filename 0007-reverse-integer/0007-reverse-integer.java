class Solution {
    public int reverse(int x) {
        StringBuilder reversed = new StringBuilder();
        if (x < 0) {
            if (x == Integer.MIN_VALUE) {
                return 0;
            }
            reversed.append('-');
            x *= -1;
        }

        String num = String.valueOf(x);
        for (int i = num.length() - 1; i >= 0; i--) {
            reversed.append(num.charAt(i));
        }

        try {
            int ans = Integer.parseInt(reversed.toString());
            return ans;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}