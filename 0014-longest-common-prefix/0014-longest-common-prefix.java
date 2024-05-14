class Solution {
    public String longestCommonPrefix(String[] strs) {
        int index = 0;
        StringBuilder sb = new StringBuilder();

        while (true) {
            if (strs[0].length() < index + 1) {
                return sb.toString();
            }

            char ch = strs[0].charAt(index);
            for (int i = 1; i < strs.length; i++) {
                String cur = strs[i];
                if (cur.length() < index + 1 || cur.charAt(index) != ch) {
                    return sb.toString();
                }
            }
            sb.append(ch);
            index++;
        }
    }
}