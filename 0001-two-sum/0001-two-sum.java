import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Integer[][] numsIndex = new Integer[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            numsIndex[i] = new Integer[]{nums[i], i};
        }

        Arrays.sort(numsIndex, (x, y) -> x[0].compareTo(y[0]));
        
        int left = 0, right = nums.length - 1;
        int sum = numsIndex[left][0] + numsIndex[right][0];
        int[] answer = new int[2];
        while (sum != target) {
            if (sum < target) {
                left++;
            } else {
                right--;
            }
            sum = numsIndex[left][0] + numsIndex[right][0];
        }

        answer[0] = numsIndex[left][1];
        answer[1] = numsIndex[right][1];
        return answer;
    }
}