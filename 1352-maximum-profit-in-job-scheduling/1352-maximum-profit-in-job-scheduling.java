class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int len = profit.length;
        int[][] jobs = new int[len][3];
        for (int i = 0; i < len; i++) {
            jobs[i] = new int[]{startTime[i], endTime[i], profit[i]};
        }

        Arrays.sort(jobs, (a, b) -> Integer.compare(a[1], b[1]));
        TreeMap<Integer, Integer> dp = new TreeMap<>();
        dp.put(0, 0);
        for (int[] job : jobs) {
            int prevProfit = dp.floorEntry(job[0]).getValue();
            int maxProfit = prevProfit + job[2];

            if (maxProfit > dp.lastEntry().getValue()) {
                dp.put(job[1], maxProfit);
            }
        }

        return dp.lastEntry().getValue();
    }
}