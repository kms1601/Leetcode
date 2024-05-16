import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        int median = total / 2 + 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int index1 = 0, index2 = 0;
        while (index1 != nums1.length || index2 != nums2.length) {
            System.out.println(index1 + " " + index2);
            if (index1 < nums1.length && (index2 == nums2.length || nums1[index1] < nums2[index2])) {
                pq.offer(nums1[index1]);
                index1++;
            } else if (index2 < nums2.length && (index1 == nums1.length || nums1[index1] >= nums2[index2])) {
                pq.offer(nums2[index2]);
                index2++;
            }

            if (pq.size() > median) {
                pq.poll();
            }
        }

        if (total % 2 == 0) {
            return (pq.poll() + pq.poll()) / 2.0;
        } else {
            return (double) pq.poll();
        }
    }
}