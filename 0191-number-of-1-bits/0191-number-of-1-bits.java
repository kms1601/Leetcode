class Solution {
    public int hammingWeight(int n) {
        String bin = Integer.toBinaryString(n);
        return (int) (bin.chars().filter(c -> c == '1').count());
    }
}