class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> temp = new ArrayList<>();
        int ans = nums.length;
        for (int n : nums) {
            if (n == val) {
                ans--;
            } else {
                temp.add(n);
            }
        }

        for (int i = 0; i < temp.size(); i++) {
            nums[i] = temp.get(i);
        }

        return ans;
    }
}