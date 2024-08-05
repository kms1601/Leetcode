class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 0) {
                count++;
                for (int j = 0; j < 3; j++) {
                    nums[i + j] = Math.abs(nums[i + j] - 1);
                }
            }
        }

        if (Arrays.stream(nums).sum() == nums.length) return count;
        return -1;
    }
}