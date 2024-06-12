class Solution {
    public void sortColors(int[] nums) {
        sort(nums);        
    }

    public void sort(int[] arr) {
        int[] count = new int[3];
        for (int n : arr) {
            count[n]++;
        }

        int i = 0;
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < count[j]; k++) {
                arr[i++] = j;
            }
        }
    }
}