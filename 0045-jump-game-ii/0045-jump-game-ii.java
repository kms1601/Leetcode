class Solution {
    public int jump(int[] nums) {
        int[] min = new int[nums.length];
        Arrays.fill(min, Integer.MAX_VALUE);
        min[0] = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j <= nums[i]; j++) {
                if (i + j < nums.length && min[i] + 1 < min[i + j]) {
                    min[i + j] = min[i] + 1;
                }
            }
        }
        return min[nums.length - 1];
    }
}