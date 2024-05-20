public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String bin = String.format("%32s", Integer.toBinaryString(n)).replace(" ", "0");
        StringBuilder sb = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            sb.append(bin.charAt(i));
        }
        long value = Long.parseLong(sb.toString(), 2);
        return (int) value;
    }
}