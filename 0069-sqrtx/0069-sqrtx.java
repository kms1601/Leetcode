class Solution {
    public int mySqrt(int x) {
        double a = 1;
        for (int i = 0; i < 1000; i++) {
            a = 0.5 * (a + x / a);
        }
        return (int) a;
    }
}