import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for (int i : nums) {
            set.add(i);
        }

        int index = 0;
        for (int i : set) {
            nums[index] = i;
            index++;
        }

        return set.size();
    }
}