class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i1 = 0;
        int i2 = 0;

        while (i1 < nums1.length && i2 < nums2.length) {
            if (nums1[i1] < nums2[i2]) {
                i1++;
            } else if (nums1[i1] > nums2[i2]) {
                i2++;
            } else {
                return nums1[i1];
            }
        }
        return -1;
    }
}